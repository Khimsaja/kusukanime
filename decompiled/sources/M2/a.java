package M2;

import A.e;
import B3.q;
import G2.C0177n;
import L2.f;
import android.graphics.Matrix;
import androidx.lifecycle.EnumC0689p;
import e4.n;
import h0.AbstractC0968M;
import h0.C0962G;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import z0.O;

/* loaded from: classes.dex */
public final class a {
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6541b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6542c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f6543d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6544e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6545f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6546g;

    /* renamed from: h, reason: collision with root package name */
    public Cloneable f6547h;

    public a(f fVar, q qVar) {
        this.f6543d = fVar;
        this.f6544e = qVar;
        this.f6545f = new e(22);
        this.f6546g = new LinkedHashMap();
        this.f6542c = true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [float[], java.lang.Cloneable] */
    public float[] a(Object obj) {
        float[] fArr = (float[]) this.f6547h;
        float[] fArr2 = fArr;
        if (fArr == null) {
            ?? A7 = C0962G.a();
            this.f6547h = A7;
            fArr2 = A7;
        }
        if (this.f6541b) {
            this.f6542c = O.t(b(obj), fArr2);
            this.f6541b = false;
        }
        if (this.f6542c) {
            return fArr2;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [e4.n, kotlin.jvm.internal.m] */
    public float[] b(Object obj) {
        float[] fArrA = (float[]) this.f6546g;
        if (fArrA == null) {
            fArrA = C0962G.a();
            this.f6546g = fArrA;
        }
        if (!this.a) {
            return fArrA;
        }
        Matrix matrix = (Matrix) this.f6544e;
        if (matrix == null) {
            matrix = new Matrix();
            this.f6544e = matrix;
        }
        ((m) this.f6543d).invoke(obj, matrix);
        Matrix matrix2 = (Matrix) this.f6545f;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            AbstractC0968M.r(matrix, fArrA);
            this.f6544e = matrix2;
            this.f6545f = matrix;
        }
        this.a = false;
        return fArrA;
    }

    public void c() {
        this.a = true;
        this.f6541b = true;
    }

    public void d() {
        f fVar = (f) this.f6543d;
        if (fVar.f().b() != EnumC0689p.f10737l) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        ((q) this.f6544e).invoke();
        fVar.f().a(new C0177n(1, this));
        this.a = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(n nVar) {
        this.f6543d = (m) nVar;
        this.a = true;
        this.f6541b = true;
        this.f6542c = true;
    }
}
