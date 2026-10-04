package B1;

import android.content.Context;
import android.os.Looper;
import g3.InterfaceC0948g;
import java.nio.ByteBuffer;

/* renamed from: B1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0020g implements InterfaceC0948g {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f328b;

    public /* synthetic */ C0020g() {
        this.a = 0;
    }

    @Override // g3.InterfaceC0948g
    public boolean a(e3.h hVar) {
        return this.f328b;
    }

    @Override // g3.InterfaceC0948g
    public boolean b() {
        return this.f328b;
    }

    public synchronized void c() {
        boolean z7 = false;
        while (!this.f328b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z7 = true;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean d() {
        if (this.f328b) {
            return false;
        }
        this.f328b = true;
        notifyAll();
        return true;
    }

    public void e(boolean z7) {
        switch (this.a) {
            case 2:
                if (this.f328b != z7) {
                    this.f328b = z7;
                    break;
                }
                break;
            default:
                if (this.f328b != z7) {
                    this.f328b = z7;
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C0020g(boolean z7, int i7) {
        this.a = i7;
        this.f328b = z7;
    }

    public C0020g(Context context, Looper looper, D d4, int i7) {
        this.a = i7;
        switch (i7) {
            case 3:
                new A.e(context.getApplicationContext(), 11);
                d4.a(looper, null);
                break;
            default:
                new A.e(context.getApplicationContext(), 10);
                d4.a(looper, null);
                break;
        }
    }

    public C0020g(C1.r rVar, C1.t tVar) {
        this.a = 1;
        int i7 = tVar.a;
        AbstractC0015b.c(i7 == 6 || i7 == 3);
        ByteBuffer byteBuffer = tVar.f626b;
        int iMin = Math.min(4, byteBuffer.remaining());
        byte[] bArr = new byte[iMin];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        A a = new A(bArr, iMin);
        rVar.getClass();
        C1.r.a(false);
        if (a.h()) {
            this.f328b = false;
            return;
        }
        int i8 = a.i(2);
        boolean zH = a.h();
        C1.r.a(false);
        if (!zH) {
            this.f328b = true;
            return;
        }
        boolean zH2 = (i8 == 3 || i8 == 0) ? true : a.h();
        a.s();
        C1.r.a(!false);
        if (a.h()) {
            C1.r.a(!false);
            a.s();
        }
        C1.r.a(false);
        if (i8 != 3) {
            a.s();
        }
        a.t(0);
        if (i8 != 2 && i8 != 0 && !zH2) {
            a.t(3);
        }
        this.f328b = ((i8 == 3 || i8 == 0) ? 255 : a.i(8)) != 0;
    }
}
