package J4;

import H4.o;
import O3.l;
import P3.z;
import io.ktor.http.ContentDisposition;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import n5.AbstractC1586x;
import n5.V;
import t5.i;
import t5.q;
import u4.EnumC2117x;
import u4.InterfaceC2095a;
import u4.InterfaceC2105k;
import u4.InterfaceC2112s;
import u4.M;
import v4.C2159g;
import x4.AbstractC2294u;
import x4.C2266L;
import x4.C2293t;
import x4.C2295v;
import z4.C2495g;
import z5.C2508m;

/* loaded from: classes.dex */
public final class f extends C2266L implements a {

    /* renamed from: P, reason: collision with root package name */
    public static final e f4293P = new e();

    /* renamed from: Q, reason: collision with root package name */
    public static final e f4294Q = new e();

    /* renamed from: N, reason: collision with root package name */
    public int f4295N;

    /* renamed from: O, reason: collision with root package name */
    public final boolean f4296O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC2105k interfaceC2105k, C2266L c2266l, v4.h hVar, W4.e eVar, int i7, M m7, boolean z7) {
        super(interfaceC2105k, c2266l, hVar, eVar, i7, m7);
        if (interfaceC2105k == null) {
            s0(0);
            throw null;
        }
        if (hVar == null) {
            s0(1);
            throw null;
        }
        if (eVar == null) {
            s0(2);
            throw null;
        }
        if (i7 == 0) {
            s0(3);
            throw null;
        }
        this.f4295N = 0;
        this.f4296O = z7;
    }

    public static f c1(InterfaceC2105k interfaceC2105k, K4.c cVar, W4.e eVar, C2495g c2495g, boolean z7) {
        if (interfaceC2105k == null) {
            s0(5);
            throw null;
        }
        if (eVar != null) {
            return new f(interfaceC2105k, null, cVar, eVar, 1, c2495g, z7);
        }
        s0(7);
        throw null;
    }

    public static /* synthetic */ void s0(int i7) {
        String str = (i7 == 13 || i7 == 18 || i7 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 13 || i7 == 18 || i7 == 21) ? 2 : 3];
        switch (i7) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i7 == 13) {
            objArr[1] = "initialize";
        } else if (i7 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i7 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i7) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 13 && i7 != 18 && i7 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // x4.AbstractC2294u, u4.InterfaceC2096b
    public final boolean K() {
        return A6.b.a(this.f4295N);
    }

    @Override // x4.C2266L, x4.AbstractC2294u
    public final AbstractC2294u P0(int i7, W4.e eVar, InterfaceC2105k interfaceC2105k, InterfaceC2112s interfaceC2112s, M m7, v4.h hVar) {
        if (interfaceC2105k == null) {
            s0(14);
            throw null;
        }
        if (i7 == 0) {
            s0(15);
            throw null;
        }
        if (hVar == null) {
            s0(16);
            throw null;
        }
        C2266L c2266l = (C2266L) interfaceC2112s;
        if (eVar == null) {
            eVar = getName();
        }
        f fVar = new f(interfaceC2105k, c2266l, hVar, eVar, i7, m7, this.f4296O);
        int i8 = this.f4295N;
        boolean z7 = false;
        if (i8 != 1) {
            if (i8 == 2) {
                z7 = true;
            } else if (i8 != 3) {
                if (i8 != 4) {
                    throw null;
                }
                z7 = true;
            }
        }
        fVar.d1(z7, A6.b.a(i8));
        return fVar;
    }

    @Override // J4.a
    public final a T(AbstractC1586x abstractC1586x, ArrayList arrayList, AbstractC1586x abstractC1586x2, l lVar) {
        ArrayList arrayListK = android.support.v4.media.session.b.k(arrayList, m0(), this);
        C2295v c2295vK = abstractC1586x == null ? null : Z4.l.k(this, abstractC1586x, C2159g.a);
        C2293t c2293tT0 = T0(V.f13380b);
        c2293tT0.f17463g = arrayListK;
        c2293tT0.f17467k = abstractC1586x2;
        c2293tT0.f17465i = c2295vK;
        c2293tT0.f17472p = true;
        c2293tT0.f17471o = true;
        f fVar = (f) c2293tT0.f17480x.Q0(c2293tT0);
        if (lVar != null) {
            fVar.U0((InterfaceC2095a) lVar.f7528k, lVar.f7529l);
        }
        if (fVar != null) {
            return fVar;
        }
        s0(21);
        throw null;
    }

    @Override // x4.C2266L
    public final C2266L b1(C2295v c2295v, C2295v c2295v2, List list, List list2, List list3, AbstractC1586x abstractC1586x, EnumC2117x enumC2117x, o oVar, z zVar) {
        t5.f fVar;
        if (list == null) {
            s0(9);
            throw null;
        }
        if (list2 == null) {
            s0(10);
            throw null;
        }
        if (list3 == null) {
            s0(11);
            throw null;
        }
        if (oVar == null) {
            s0(12);
            throw null;
        }
        super.b1(c2295v, c2295v2, list, list2, list3, abstractC1586x, enumC2117x, oVar, zVar);
        for (i iVar : q.a) {
            iVar.getClass();
            W4.e eVar = iVar.a;
            if (eVar == null || kotlin.jvm.internal.l.a(getName(), eVar)) {
                C2508m c2508m = iVar.f16108b;
                if (c2508m != null) {
                    String strB = getName().b();
                    kotlin.jvm.internal.l.e("asString(...)", strB);
                    if (!c2508m.b(strB)) {
                        continue;
                    }
                }
                Collection collection = iVar.f16109c;
                if (collection == null || collection.contains(getName())) {
                    t5.e[] eVarArr = iVar.f16111e;
                    int length = eVarArr.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length) {
                            fVar = ((String) iVar.f16110d.invoke(this)) != null ? new t5.f(false) : t5.f.f16097c;
                        } else {
                            if (eVarArr[i7].a(this) != null) {
                                fVar = new t5.f(false);
                                break;
                            }
                            i7++;
                        }
                    }
                    this.f17500w = fVar.a;
                    return this;
                }
            }
        }
        fVar = t5.f.f16096b;
        this.f17500w = fVar.a;
        return this;
    }

    public final void d1(boolean z7, boolean z8) {
        this.f4295N = z7 ? z8 ? 4 : 2 : z8 ? 3 : 1;
    }
}
