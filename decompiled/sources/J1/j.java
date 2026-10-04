package J1;

import B1.RunnableC0016c;
import H1.C0226g;
import android.os.Handler;
import y1.b0;

/* loaded from: classes.dex */
public final class j {
    public final Handler a;

    /* renamed from: b, reason: collision with root package name */
    public final H1.D f4207b;

    public j(Handler handler, H1.D d4, int i7) {
        switch (i7) {
            case 1:
                if (d4 != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.a = handler;
                this.f4207b = d4;
                break;
            default:
                this.a = handler;
                this.f4207b = d4;
                break;
        }
    }

    public void a(C0226g c0226g) {
        synchronized (c0226g) {
        }
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new RunnableC0016c(12, this, c0226g));
        }
    }

    public void b(b0 b0Var) {
        Handler handler = this.a;
        if (handler != null) {
            handler.post(new RunnableC0016c(18, this, b0Var));
        }
    }
}
