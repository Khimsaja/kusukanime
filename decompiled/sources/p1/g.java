package p1;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import g1.RunnableC0933a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m.C1485f;
import p.I0;
import q1.C1846b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f14168j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static volatile g f14169k;
    public final ReentrantReadWriteLock a;

    /* renamed from: b, reason: collision with root package name */
    public final C1485f f14170b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f14171c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f14172d;

    /* renamed from: e, reason: collision with root package name */
    public final e f14173e;

    /* renamed from: f, reason: collision with root package name */
    public final f f14174f;

    /* renamed from: g, reason: collision with root package name */
    public final I0 f14175g;

    /* renamed from: h, reason: collision with root package name */
    public final int f14176h;

    /* renamed from: i, reason: collision with root package name */
    public final C1780c f14177i;

    public g(o oVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.f14171c = 3;
        f fVar = (f) oVar.f4691b;
        this.f14174f = fVar;
        int i7 = oVar.a;
        this.f14176h = i7;
        this.f14177i = (C1780c) oVar.f4692c;
        this.f14172d = new Handler(Looper.getMainLooper());
        this.f14170b = new C1485f();
        this.f14175g = new I0(2);
        e eVar = new e(this);
        this.f14173e = eVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i7 == 0) {
            try {
                this.f14171c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                fVar.a(new C1781d(eVar));
            } catch (Throwable th2) {
                e(th2);
            }
        }
    }

    public static g a() {
        g gVar;
        synchronized (f14168j) {
            try {
                gVar = f14169k;
                if (!(gVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return gVar;
    }

    public static boolean c() {
        return f14169k != null;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.f14171c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void d() {
        if (!(this.f14176h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.f14171c == 0) {
                return;
            }
            this.f14171c = 0;
            this.a.writeLock().unlock();
            e eVar = this.f14173e;
            g gVar = eVar.a;
            try {
                gVar.f14174f.a(new C1781d(eVar));
            } catch (Throwable th) {
                gVar.e(th);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }

    public final void e(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.f14171c = 2;
            arrayList.addAll(this.f14170b);
            this.f14170b.clear();
            this.a.writeLock().unlock();
            this.f14172d.post(new RunnableC0933a(arrayList, this.f14171c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void f(EditorInfo editorInfo) {
        if (b() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        e eVar = this.f14173e;
        eVar.getClass();
        Bundle bundle = editorInfo.extras;
        C1846b c1846b = (C1846b) eVar.f14167c.f110l;
        int iA = c1846b.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) c1846b.f7975n).getInt(iA + c1846b.f7972k) : 0);
        Bundle bundle2 = editorInfo.extras;
        eVar.a.getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
