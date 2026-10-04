package H1;

import D6.RunnableC0121o;
import O1.C0544s;
import O1.C0549x;
import android.util.Pair;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Z implements O1.H, K1.f {
    public final b0 a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c0 f3399b;

    public Z(c0 c0Var, b0 b0Var) {
        this.f3399b = c0Var;
        this.a = b0Var;
    }

    @Override // O1.H
    public final void C(int i7, O1.B b4, C0549x c0549x) {
        Pair pairA = a(i7, b4);
        if (pairA != null) {
            this.f3399b.f3419i.c(new RunnableC0121o(this, pairA, c0549x, 4));
        }
    }

    public final Pair a(int i7, O1.B b4) {
        O1.B bA;
        b0 b0Var = this.a;
        O1.B b7 = null;
        if (b4 != null) {
            int i8 = 0;
            while (true) {
                if (i8 >= b0Var.f3409c.size()) {
                    bA = null;
                    break;
                }
                if (((O1.B) b0Var.f3409c.get(i8)).f7254d == b4.f7254d) {
                    Object obj = b0Var.f3408b;
                    int i9 = j0.f3508k;
                    bA = b4.a(Pair.create(obj, b4.a));
                    break;
                }
                i8++;
            }
            if (bA == null) {
                return null;
            }
            b7 = bA;
        }
        return Pair.create(Integer.valueOf(i7 + b0Var.f3410d), b7);
    }

    @Override // O1.H
    public final void c(int i7, O1.B b4, final C0544s c0544s, final C0549x c0549x, final IOException iOException, final boolean z7) {
        final Pair pairA = a(i7, b4);
        if (pairA != null) {
            this.f3399b.f3419i.c(new Runnable() { // from class: H1.Y
                @Override // java.lang.Runnable
                public final void run() {
                    I1.f fVar = this.f3393k.f3399b.f3418h;
                    Pair pair = pairA;
                    fVar.c(((Integer) pair.first).intValue(), (O1.B) pair.second, c0544s, c0549x, iOException, z7);
                }
            });
        }
    }

    @Override // O1.H
    public final void i(int i7, O1.B b4, final C0544s c0544s, final C0549x c0549x, final int i8) {
        final Pair pairA = a(i7, b4);
        if (pairA != null) {
            this.f3399b.f3419i.c(new Runnable() { // from class: H1.X
                @Override // java.lang.Runnable
                public final void run() {
                    I1.f fVar = this.f3388k.f3399b.f3418h;
                    Pair pair = pairA;
                    fVar.i(((Integer) pair.first).intValue(), (O1.B) pair.second, c0544s, c0549x, i8);
                }
            });
        }
    }

    @Override // O1.H
    public final void x(int i7, O1.B b4, C0544s c0544s, C0549x c0549x) {
        Pair pairA = a(i7, b4);
        if (pairA != null) {
            this.f3399b.f3419i.c(new W(this, pairA, c0544s, c0549x, 0));
        }
    }

    @Override // O1.H
    public final void z(int i7, O1.B b4, C0544s c0544s, C0549x c0549x) {
        Pair pairA = a(i7, b4);
        if (pairA != null) {
            this.f3399b.f3419i.c(new W(this, pairA, c0544s, c0549x, 1));
        }
    }
}
