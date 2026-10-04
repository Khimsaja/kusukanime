package Q4;

import B1.K;
import H1.G;
import O.C0486d;
import O.T;
import P4.l;
import P4.m;
import h5.InterfaceC1015d;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import n5.AbstractC1586x;
import p.u0;
import v4.InterfaceC2153a;
import v4.h;
import y1.L;
import y1.O;
import y1.P;

/* loaded from: classes.dex */
public abstract class c implements m, InterfaceC1015d, InterfaceC2153a, L {

    /* renamed from: k, reason: collision with root package name */
    public final Object f8011k;

    public /* synthetic */ c(Object obj) {
        this.f8011k = obj;
    }

    public static /* synthetic */ void s0(int i7) {
        String str = (i7 == 1 || i7 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2) ? 2 : 3];
        if (i7 == 1 || i7 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i7 == 1) {
            objArr[1] = "getType";
        } else if (i7 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i7 != 1 && i7 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static /* synthetic */ void t0(int i7) {
        String str = i7 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i7 != 1 ? 3 : 2];
        if (i7 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i7 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i7 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public boolean A0() {
        G g4 = (G) this;
        P pU0 = g4.U0();
        return !pU0.p() && pU0.m(g4.R0(), (O) this.f8011k, 0L).a();
    }

    public boolean B0() {
        G g4 = (G) this;
        P pU0 = g4.U0();
        return !pU0.p() && pU0.m(g4.R0(), (O) this.f8011k, 0L).f17960g;
    }

    public abstract void C0(int i7, long j7, boolean z7);

    public void D0(int i7, long j7) {
        C0(((G) this).R0(), j7, false);
    }

    public void E0() {
        int iE;
        int iE2;
        G g4 = (G) this;
        if (g4.U0().p() || g4.c1()) {
            x0();
            return;
        }
        P pU0 = g4.U0();
        if (pU0.p()) {
            iE = -1;
        } else {
            int iR0 = g4.R0();
            g4.u1();
            int i7 = g4.f3231P;
            if (i7 == 1) {
                i7 = 0;
            }
            g4.u1();
            iE = pU0.e(iR0, i7, g4.f3232Q);
        }
        if (!(iE != -1)) {
            if (A0() && z0()) {
                C0(g4.R0(), -9223372036854775807L, false);
                return;
            } else {
                x0();
                return;
            }
        }
        P pU02 = g4.U0();
        if (pU02.p()) {
            iE2 = -1;
        } else {
            int iR02 = g4.R0();
            g4.u1();
            int i8 = g4.f3231P;
            if (i8 == 1) {
                i8 = 0;
            }
            g4.u1();
            iE2 = pU02.e(iR02, i8, g4.f3232Q);
        }
        if (iE2 == -1) {
            x0();
        } else if (iE2 == g4.R0()) {
            C0(g4.R0(), -9223372036854775807L, true);
        } else {
            C0(iE2, -9223372036854775807L, false);
        }
    }

    public void F0(int i7, long j7) {
        G g4 = (G) this;
        long jS0 = g4.S0() + j7;
        long jX0 = g4.X0();
        if (jX0 != -9223372036854775807L) {
            jS0 = Math.min(jS0, jX0);
        }
        D0(i7, Math.max(jS0, 0L));
    }

    public void G0() {
        int iK;
        int iK2;
        int iK3;
        G g4 = (G) this;
        if (g4.U0().p() || g4.c1()) {
            x0();
            return;
        }
        P pU0 = g4.U0();
        if (pU0.p()) {
            iK = -1;
        } else {
            int iR0 = g4.R0();
            g4.u1();
            int i7 = g4.f3231P;
            if (i7 == 1) {
                i7 = 0;
            }
            g4.u1();
            iK = pU0.k(iR0, i7, g4.f3232Q);
        }
        boolean z7 = iK != -1;
        if (A0() && !B0()) {
            if (!z7) {
                x0();
                return;
            }
            P pU02 = g4.U0();
            if (pU02.p()) {
                iK3 = -1;
            } else {
                int iR02 = g4.R0();
                g4.u1();
                int i8 = g4.f3231P;
                if (i8 == 1) {
                    i8 = 0;
                }
                g4.u1();
                iK3 = pU02.k(iR02, i8, g4.f3232Q);
            }
            if (iK3 == -1) {
                x0();
                return;
            } else if (iK3 == g4.R0()) {
                C0(g4.R0(), -9223372036854775807L, true);
                return;
            } else {
                C0(iK3, -9223372036854775807L, false);
                return;
            }
        }
        if (z7) {
            long jS0 = g4.S0();
            g4.u1();
            if (jS0 <= g4.f3224G) {
                P pU03 = g4.U0();
                if (pU03.p()) {
                    iK2 = -1;
                } else {
                    int iR03 = g4.R0();
                    g4.u1();
                    int i9 = g4.f3231P;
                    if (i9 == 1) {
                        i9 = 0;
                    }
                    g4.u1();
                    iK2 = pU03.k(iR03, i9, g4.f3232Q);
                }
                if (iK2 == -1) {
                    x0();
                    return;
                } else if (iK2 == g4.R0()) {
                    C0(g4.R0(), -9223372036854775807L, true);
                    return;
                } else {
                    C0(iK2, -9223372036854775807L, false);
                    return;
                }
            }
        }
        D0(7, 0L);
    }

    public abstract void H0(Object obj);

    public abstract void I0(u0 u0Var);

    public abstract void J0();

    public abstract void K0(String[] strArr);

    @Override // P4.m
    public void f() {
        K0((String[]) ((ArrayList) this.f8011k).toArray(new String[0]));
    }

    public h getAnnotations() {
        h hVar = (h) this.f8011k;
        if (hVar != null) {
            return hVar;
        }
        t0(1);
        throw null;
    }

    @Override // h5.InterfaceC1015d
    public AbstractC1586x getType() {
        AbstractC1586x abstractC1586x = (AbstractC1586x) this.f8011k;
        if (abstractC1586x != null) {
            return abstractC1586x;
        }
        s0(1);
        throw null;
    }

    @Override // P4.m
    public void j0(Object obj) {
        if (obj instanceof String) {
            ((ArrayList) this.f8011k).add((String) obj);
        }
    }

    @Override // P4.m
    public l q0(W4.b bVar) {
        return null;
    }

    public long u0() {
        G g4 = (G) this;
        P pU0 = g4.U0();
        if (pU0.p()) {
            return -9223372036854775807L;
        }
        return K.P(pU0.m(g4.R0(), (O) this.f8011k, 0L).f17965l);
    }

    public abstract Object v0();

    public abstract Object w0();

    public void x0() {
        ((G) this).u1();
    }

    public boolean y0(int i7) {
        G g4 = (G) this;
        g4.u1();
        return g4.f3239X.a.a.get(i7);
    }

    public boolean z0() {
        G g4 = (G) this;
        P pU0 = g4.U0();
        return !pU0.p() && pU0.m(g4.R0(), (O) this.f8011k, 0L).f17961h;
    }

    public c(h hVar) {
        if (hVar != null) {
            this.f8011k = hVar;
        } else {
            t0(0);
            throw null;
        }
    }

    public c(AbstractC1586x abstractC1586x) {
        if (abstractC1586x != null) {
            this.f8011k = abstractC1586x;
        } else {
            s0(0);
            throw null;
        }
    }

    public c(int i7) {
        switch (i7) {
            case 3:
                this.f8011k = new P3.l();
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 6:
            default:
                this.f8011k = new ArrayList();
                break;
            case 5:
                this.f8011k = C0486d.K(Boolean.FALSE, T.f7049p);
                break;
            case 7:
                this.f8011k = new O();
                break;
        }
    }

    @Override // P4.m
    public void q(b5.f fVar) {
    }

    @Override // P4.m
    public void S(W4.b bVar, W4.e eVar) {
    }
}
