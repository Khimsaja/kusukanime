package p1;

import android.os.Trace;
import f1.AbstractC0872e;

/* loaded from: classes.dex */
public final class j implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i7 = AbstractC0872e.a;
            Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
            if (g.c()) {
                g.a().d();
            }
            Trace.endSection();
        } catch (Throwable th) {
            int i8 = AbstractC0872e.a;
            Trace.endSection();
            throw th;
        }
    }
}
