package v4;

import java.util.Map;
import n5.AbstractC1586x;
import n5.B;
import u4.InterfaceC2099e;
import u4.M;

/* renamed from: v4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2155c implements InterfaceC2154b {
    public final B a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f16637b;

    /* renamed from: c, reason: collision with root package name */
    public final M f16638c;

    public C2155c(B b4, Map map, M m7) {
        if (b4 == null) {
            c(0);
            throw null;
        }
        if (map == null) {
            c(1);
            throw null;
        }
        this.a = b4;
        this.f16637b = map;
        this.f16638c = m7;
    }

    public static /* synthetic */ void c(int i7) {
        String str = (i7 == 3 || i7 == 4 || i7 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 3 || i7 == 4 || i7 == 5) ? 2 : 3];
        if (i7 == 1) {
            objArr[0] = "valueArguments";
        } else if (i7 == 2) {
            objArr[0] = "source";
        } else if (i7 == 3 || i7 == 4 || i7 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i7 == 3) {
            objArr[1] = "getType";
        } else if (i7 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i7 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i7 != 3 && i7 != 4 && i7 != 5) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i7 != 3 && i7 != 4 && i7 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // v4.InterfaceC2154b
    public final W4.c a() {
        InterfaceC2099e interfaceC2099eD = d5.e.d(this);
        if (interfaceC2099eD != null) {
            if (p5.l.f(interfaceC2099eD)) {
                interfaceC2099eD = null;
            }
            if (interfaceC2099eD != null) {
                return d5.e.c(interfaceC2099eD);
            }
        }
        return null;
    }

    @Override // v4.InterfaceC2154b
    public final Map b() {
        Map map = this.f16637b;
        if (map != null) {
            return map;
        }
        c(4);
        throw null;
    }

    @Override // v4.InterfaceC2154b
    public final AbstractC1586x getType() {
        B b4 = this.a;
        if (b4 != null) {
            return b4;
        }
        c(3);
        throw null;
    }

    @Override // v4.InterfaceC2154b
    public final M l() {
        M m7 = this.f16638c;
        if (m7 != null) {
            return m7;
        }
        c(5);
        throw null;
    }

    public final String toString() {
        return Y4.h.f10162c.u(this, null);
    }
}
