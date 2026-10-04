package com.kusukanime.data;

import I2.g;
import P3.m;
import P3.q;
import P3.y;
import Z3.j;
import android.content.Context;
import io.ktor.http.ContentType;
import io.ktor.http.auth.HttpAuthHeader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z1.c;
import z5.AbstractC2510o;
import z5.AbstractC2517v;
import z5.C2496a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/kusukanime/data/CrashLog;", "", "<init>", "()V", "DIR", "", "MAX_FILES", "", "PREFIX_CRASH", "PREFIX_DIAG", "save", "", "ctx", "Landroid/content/Context;", ContentType.Text.TYPE, "saveDiag", "write", "prefix", "clearDiag", "list", "", "Ljava/io/File;", "read", "f", "clear", "uploadPending", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CrashLog {
    public static final int $stable = 0;
    private static final String DIR = "crashes";
    public static final CrashLog INSTANCE = new CrashLog();
    private static final int MAX_FILES = 20;
    private static final String PREFIX_CRASH = "crash-";
    private static final String PREFIX_DIAG = "diag-";

    private CrashLog() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: Exception -> 0x014d, TryCatch #2 {Exception -> 0x014d, blocks: (B:3:0x0002, B:5:0x0013, B:7:0x001d, B:9:0x002e, B:14:0x004a, B:11:0x003d, B:13:0x0047, B:15:0x004d, B:18:0x0055, B:19:0x0076, B:21:0x007c, B:25:0x0092, B:27:0x0098), top: B:48:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void uploadPending$lambda$0(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kusukanime.data.CrashLog.uploadPending$lambda$0(android.content.Context):void");
    }

    private final void write(Context ctx, String prefix, String text) throws IOException {
        try {
            File file = new File(ctx.getFilesDir(), DIR);
            file.mkdirs();
            File file2 = new File(file, prefix + System.currentTimeMillis() + ".txt");
            StringBuilder sb = new StringBuilder("v=0.0.27 (30)\n");
            sb.append(text);
            String string = sb.toString();
            Charset charset = C2496a.f19036b;
            l.f(ContentType.Text.TYPE, string);
            l.f(HttpAuthHeader.Parameters.Charset, charset);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                j.Q(fileOutputStream, string, charset);
                fileOutputStream.close();
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    Iterator it = q.o0(m.s0(fileArrListFiles, new Comparator() { // from class: com.kusukanime.data.CrashLog$write$$inlined$sortedByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t7, T t8) {
                            return c.h(((File) t8).getName(), ((File) t7).getName());
                        }
                    }), 60).iterator();
                    while (it.hasNext()) {
                        ((File) it.next()).delete();
                    }
                }
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public final void clear(Context ctx) {
        l.f("ctx", ctx);
        try {
            File[] fileArrListFiles = new File(ctx.getFilesDir(), DIR).listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void clearDiag(Context ctx) {
        l.f("ctx", ctx);
        try {
            File[] fileArrListFiles = new File(ctx.getFilesDir(), DIR).listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    l.e("getName(...)", name);
                    if (AbstractC2510o.W(name, PREFIX_DIAG, false)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final List<File> list(Context ctx) {
        y yVar = y.f7779k;
        l.f("ctx", ctx);
        try {
            File[] fileArrListFiles = new File(ctx.getFilesDir(), DIR).listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    String name = file.getName();
                    l.e("getName(...)", name);
                    if (AbstractC2517v.T(name, PREFIX_CRASH, false)) {
                        arrayList.add(file);
                    }
                }
                return q.O0(arrayList, new Comparator() { // from class: com.kusukanime.data.CrashLog$list$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t7, T t8) {
                        return c.h(((File) t8).getName(), ((File) t7).getName());
                    }
                });
            }
        } catch (Exception unused) {
        }
        return yVar;
    }

    public final String read(File f5) {
        l.f("f", f5);
        try {
            return AbstractC2510o.I0(8000, j.O(f5));
        } catch (Exception unused) {
            return "";
        }
    }

    public final void save(Context ctx, String text) throws IOException {
        l.f("ctx", ctx);
        l.f(ContentType.Text.TYPE, text);
        write(ctx, PREFIX_CRASH, text);
        uploadPending(ctx);
    }

    public final void saveDiag(Context ctx, String text) throws IOException {
        l.f("ctx", ctx);
        l.f(ContentType.Text.TYPE, text);
        write(ctx, PREFIX_DIAG, text);
        uploadPending(ctx);
    }

    public final void uploadPending(Context ctx) {
        l.f("ctx", ctx);
        new Thread(new g(ctx, 2)).start();
    }
}
