package n5;

import io.ktor.http.LinkHeader;
import io.ktor.util.GzipHeaderFlags;
import o5.C1706f;

/* loaded from: classes.dex */
public final class G extends Q {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13358b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13359c;

    public G(AbstractC1586x abstractC1586x, b0 b0Var) {
        if (b0Var == null) {
            e(0);
            throw null;
        }
        if (abstractC1586x == null) {
            e(1);
            throw null;
        }
        this.f13358b = b0Var;
        this.f13359c = abstractC1586x;
    }

    public static /* synthetic */ void e(int i7) {
        String str = (i7 == 4 || i7 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 4 || i7 == 5) ? 2 : 3];
        switch (i7) {
            case 1:
            case 2:
            case 3:
                objArr[0] = LinkHeader.Parameters.Type;
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i7 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i7 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i7 == 3) {
            objArr[2] = "replaceType";
        } else if (i7 != 4 && i7 != 5) {
            if (i7 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i7 != 4 && i7 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // n5.Q
    public final b0 a() {
        switch (this.a) {
            case 0:
                return b0.f13392o;
            default:
                b0 b0Var = (b0) this.f13358b;
                if (b0Var != null) {
                    return b0Var;
                }
                e(4);
                throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [O3.i, java.lang.Object] */
    @Override // n5.Q
    public final AbstractC1586x b() {
        switch (this.a) {
            case 0:
                return (AbstractC1586x) this.f13359c.getValue();
            default:
                AbstractC1586x abstractC1586x = (AbstractC1586x) this.f13359c;
                if (abstractC1586x != null) {
                    return abstractC1586x;
                }
                e(5);
                throw null;
        }
    }

    @Override // n5.Q
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // n5.Q
    public final Q d(C1706f c1706f) {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
                return this;
            default:
                if (c1706f == null) {
                    e(6);
                    throw null;
                }
                c1706f.getClass();
                AbstractC1586x abstractC1586x = (AbstractC1586x) this.f13359c;
                kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, abstractC1586x);
                return new G(abstractC1586x, (b0) this.f13358b);
        }
    }

    public G(u4.Q q6) {
        kotlin.jvm.internal.l.f("typeParameter", q6);
        this.f13358b = q6;
        this.f13359c = z1.c.B(O3.j.f7525k, new H4.u(15, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public G(AbstractC1586x abstractC1586x) {
        this(abstractC1586x, b0.f13390m);
        if (abstractC1586x != null) {
        } else {
            e(2);
            throw null;
        }
    }
}
