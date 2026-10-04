package B1;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import d1.AbstractC0784c;
import f.AbstractC0847h;
import f1.AbstractC0871d;
import f1.AbstractC0872e;
import java.nio.MappedByteBuffer;
import l4.AbstractC1420H;
import p.I0;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f362k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f363l;

    public /* synthetic */ w(int i7, Object obj) {
        this.f362k = i7;
        this.f363l = obj;
    }

    private final void a() {
        p1.n nVar = (p1.n) this.f363l;
        synchronized (nVar.f14186n) {
            try {
                if (nVar.f14190r == null) {
                    return;
                }
                try {
                    g1.i iVarC = nVar.c();
                    int i7 = iVarC.f11689e;
                    if (i7 == 2) {
                        synchronized (nVar.f14186n) {
                        }
                    }
                    if (i7 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i7 + ")");
                    }
                    try {
                        int i8 = AbstractC0872e.a;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        I0 i02 = nVar.f14185m;
                        Context context = nVar.f14183k;
                        i02.getClass();
                        g1.i[] iVarArr = {iVarC};
                        AbstractC1420H abstractC1420H = AbstractC0784c.a;
                        n6.m.m("TypefaceCompat.createFromFontInfo");
                        try {
                            Typeface typefaceT = AbstractC0784c.a.t(context, iVarArr);
                            Trace.endSection();
                            MappedByteBuffer mappedByteBufferR = n6.d.R(nVar.f14183k, iVarC.a);
                            if (mappedByteBufferR == null || typefaceT == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                A2.b bVar = new A2.b(typefaceT, AbstractC0871d.m0(mappedByteBufferR));
                                Trace.endSection();
                                synchronized (nVar.f14186n) {
                                    try {
                                        AbstractC0847h abstractC0847h = nVar.f14190r;
                                        if (abstractC0847h != null) {
                                            abstractC0847h.u(bVar);
                                        }
                                    } finally {
                                    }
                                }
                                nVar.b();
                            } finally {
                                int i9 = AbstractC0872e.a;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (nVar.f14186n) {
                        try {
                            AbstractC0847h abstractC0847h2 = nVar.f14190r;
                            if (abstractC0847h2 != null) {
                                abstractC0847h2.t(th2);
                            }
                            nVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x035a A[LOOP:7: B:161:0x031e->B:184:0x035a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04e5 A[Catch: all -> 0x04aa, TryCatch #3 {, blocks: (B:251:0x049f, B:253:0x04a3, B:260:0x04af, B:264:0x04b6, B:270:0x04c2, B:272:0x04c6, B:274:0x04cc, B:276:0x04d6, B:278:0x04e0, B:280:0x04f1, B:279:0x04e5, B:281:0x04f3, B:283:0x0506, B:285:0x050e), top: B:296:0x049f }] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v37, types: [O3.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [O3.i, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.w.run():void");
    }

    public /* synthetic */ w(n6.d dVar, Typeface typeface) {
        this.f362k = 20;
        this.f363l = typeface;
    }
}
