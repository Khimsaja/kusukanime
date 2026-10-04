package H1;

import B1.AbstractC0015b;
import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import g3.AbstractC0946e;
import java.util.ArrayList;
import s2.C1983k;
import s2.InterfaceC1980h;

/* renamed from: H1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221b implements V1.p {

    /* renamed from: k, reason: collision with root package name */
    public boolean f3404k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f3405l;

    /* renamed from: m, reason: collision with root package name */
    public Object f3406m;

    /* renamed from: n, reason: collision with root package name */
    public Object f3407n;

    public C0221b(int i7) {
        switch (i7) {
            case 3:
                this.f3405l = new float[16];
                this.f3406m = new float[16];
                this.f3407n = new B1.G(0, (byte) 0);
                break;
            default:
                this.f3405l = new Object();
                this.f3406m = new ArrayList();
                this.f3407n = new ArrayList();
                this.f3404k = true;
                break;
        }
    }

    public static void c(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f5 = fArr2[10];
        float f7 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f7 * f7) + (f5 * f5));
        float f8 = fArr2[10] / fSqrt;
        fArr[0] = f8;
        float f9 = fArr2[8];
        fArr[2] = f9 / fSqrt;
        fArr[8] = (-f9) / fSqrt;
        fArr[10] = f8;
    }

    public void a(boolean z7) {
        V2.g gVar = (V2.g) this.f3407n;
        synchronized (gVar) {
            try {
                if (this.f3404k) {
                    throw new IllegalStateException("editor is closed");
                }
                if (kotlin.jvm.internal.l.a(((V2.c) this.f3405l).f9451g, this)) {
                    V2.g.b(gVar, this, z7);
                }
                this.f3404k = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V1.p
    public void b() {
        ((V1.p) this.f3405l).b();
        if (!this.f3404k) {
            return;
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) this.f3407n;
            if (i7 >= sparseArray.size()) {
                return;
            }
            ((C1983k) sparseArray.valueAt(i7)).f15529i = true;
            i7++;
        }
    }

    public w6.y d(int i7) {
        w6.y yVar;
        V2.g gVar = (V2.g) this.f3407n;
        synchronized (gVar) {
            if (this.f3404k) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f3406m)[i7] = true;
            Object obj = ((V2.c) this.f3405l).f9448d.get(i7);
            V2.e eVar = gVar.f9475z;
            w6.y yVar2 = (w6.y) obj;
            if (!eVar.g(yVar2)) {
                AbstractC0946e.a(eVar.v(yVar2));
            }
            yVar = (w6.y) obj;
        }
        return yVar;
    }

    public void e() {
        if (this.f3404k) {
            ((B1.F) this.f3407n).c(new B1.w(4, this));
            this.f3404k = false;
        }
    }

    @Override // V1.p
    public void k(V1.A a) {
        ((V1.p) this.f3405l).k(a);
    }

    @Override // V1.p
    public V1.G m(int i7, int i8) {
        V1.p pVar = (V1.p) this.f3405l;
        if (i8 != 3) {
            this.f3404k = true;
            return pVar.m(i7, i8);
        }
        SparseArray sparseArray = (SparseArray) this.f3407n;
        C1983k c1983k = (C1983k) sparseArray.get(i7);
        if (c1983k != null) {
            return c1983k;
        }
        C1983k c1983k2 = new C1983k(pVar.m(i7, i8), (InterfaceC1980h) this.f3406m);
        sparseArray.put(i7, c1983k2);
        return c1983k2;
    }

    public C0221b(V1.p pVar, InterfaceC1980h interfaceC1980h) {
        this.f3405l = pVar;
        this.f3406m = interfaceC1980h;
        this.f3407n = new SparseArray();
    }

    public C0221b(Context context, Looper looper, Looper looper2, D d4, B1.D d6) {
        this.f3405l = context.getApplicationContext();
        this.f3407n = d6.a(looper, null);
        this.f3406m = new C0220a(this, d6.a(looper2, null), d4);
    }

    public C0221b(V2.g gVar, V2.c cVar) {
        this.f3407n = gVar;
        this.f3405l = cVar;
        gVar.getClass();
        this.f3406m = new boolean[2];
    }

    public C0221b(Context context, Q1.q qVar) {
        AudioManager audioManagerS = context == null ? null : z1.c.s(context);
        if (audioManagerS != null) {
            context.getClass();
            if (!B1.K.E(context)) {
                Spatializer spatializer = audioManagerS.getSpatializer();
                this.f3405l = spatializer;
                this.f3404k = spatializer.getImmersiveAudioLevel() != 0;
                Q1.l lVar = new Q1.l(qVar);
                this.f3407n = lVar;
                Looper looperMyLooper = Looper.myLooper();
                AbstractC0015b.i(looperMyLooper);
                Handler handler = new Handler(looperMyLooper);
                this.f3406m = handler;
                spatializer.addOnSpatializerStateChangedListener(new J1.y(0, handler), lVar);
                return;
            }
        }
        this.f3405l = null;
        this.f3404k = false;
        this.f3406m = null;
        this.f3407n = null;
    }
}
