package x4;

import e4.InterfaceC0821a;
import h5.C1012a;
import h5.C1013b;
import io.ktor.http.ContentDisposition;
import io.ktor.http.LinkHeader;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import n5.V;
import n5.b0;
import u4.AbstractC2108n;
import u4.EnumC2117x;
import u4.InterfaceC2105k;

/* renamed from: x4.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2262H {
    public InterfaceC2105k a;

    /* renamed from: b, reason: collision with root package name */
    public EnumC2117x f17366b;

    /* renamed from: c, reason: collision with root package name */
    public H4.o f17367c;

    /* renamed from: e, reason: collision with root package name */
    public int f17369e;

    /* renamed from: h, reason: collision with root package name */
    public final C2295v f17372h;

    /* renamed from: i, reason: collision with root package name */
    public final W4.e f17373i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC1586x f17374j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2263I f17375k;

    /* renamed from: d, reason: collision with root package name */
    public u4.K f17368d = null;

    /* renamed from: f, reason: collision with root package name */
    public n5.T f17370f = n5.T.a;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17371g = true;

    public C2262H(C2263I c2263i) {
        this.f17375k = c2263i;
        this.a = c2263i.k();
        this.f17366b = c2263i.e();
        this.f17367c = c2263i.getVisibility();
        this.f17369e = c2263i.c();
        this.f17372h = c2263i.f17379D;
        this.f17373i = c2263i.getName();
        this.f17374j = c2263i.getType();
    }

    public static /* synthetic */ void a(int i7) {
        String str = (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 5 || i7 == 7 || i7 == 9 || i7 == 11 || i7 == 19 || i7 == 13 || i7 == 14 || i7 == 16 || i7 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i7 == 1 || i7 == 2 || i7 == 3 || i7 == 5 || i7 == 7 || i7 == 9 || i7 == 11 || i7 == 19 || i7 == 13 || i7 == 14 || i7 == 16 || i7 == 17) ? 2 : 3];
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[0] = LinkHeader.Parameters.Type;
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = ContentDisposition.Parameters.Name;
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i7 == 1) {
            objArr[1] = "setOwner";
        } else if (i7 == 2) {
            objArr[1] = "setOriginal";
        } else if (i7 == 3) {
            objArr[1] = "setPreserveSourceElement";
        } else if (i7 == 5) {
            objArr[1] = "setReturnType";
        } else if (i7 == 7) {
            objArr[1] = "setModality";
        } else if (i7 == 9) {
            objArr[1] = "setVisibility";
        } else if (i7 == 11) {
            objArr[1] = "setKind";
        } else if (i7 == 19) {
            objArr[1] = "setName";
        } else if (i7 == 13) {
            objArr[1] = "setTypeParameters";
        } else if (i7 == 14) {
            objArr[1] = "setDispatchReceiverParameter";
        } else if (i7 == 16) {
            objArr[1] = "setSubstitution";
        } else if (i7 != 17) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
        } else {
            objArr[1] = "setCopyOverrides";
        }
        switch (i7) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i7 != 1 && i7 != 2 && i7 != 3 && i7 != 5 && i7 != 7 && i7 != 9 && i7 != 11 && i7 != 19 && i7 != 13 && i7 != 14 && i7 != 16 && i7 != 17) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final C2263I b() {
        C2295v c2295v;
        C2295v c2295v2;
        C2264J c2264j;
        C2265K c2265k;
        V v5;
        InterfaceC0821a interfaceC0821a;
        C2295v c2295v3;
        C2295v c2295v4;
        C2263I c2263i = this.f17375k;
        c2263i.getClass();
        InterfaceC2105k interfaceC2105k = this.a;
        EnumC2117x enumC2117x = this.f17366b;
        H4.o oVar = this.f17367c;
        u4.K k7 = this.f17368d;
        int i7 = this.f17369e;
        u4.N n7 = u4.M.f16295i;
        C2263I c2263iP0 = c2263i.P0(interfaceC2105k, enumC2117x, oVar, k7, i7, this.f17373i);
        List typeParameters = c2263i.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        V vA = AbstractC1566c.A(typeParameters, this.f17370f, c2263iP0, arrayList);
        b0 b0Var = b0.f13392o;
        AbstractC1586x abstractC1586x = this.f17374j;
        AbstractC1586x abstractC1586xI = vA.i(abstractC1586x, b0Var);
        if (abstractC1586xI != null) {
            b0 b0Var2 = b0.f13391n;
            AbstractC1586x abstractC1586xI2 = vA.i(abstractC1586x, b0Var2);
            if (abstractC1586xI2 != null) {
                c2263iP0.T0(abstractC1586xI2);
            }
            C2295v c2295v5 = this.f17372h;
            if (c2295v5 != null) {
                C2295v c2295vB = c2295v5.b(vA);
                c2295v = c2295vB != null ? c2295vB : null;
            }
            C2295v c2295v6 = c2263i.f17380E;
            if (c2295v6 != null) {
                AbstractC1586x abstractC1586xI3 = vA.i(c2295v6.getType(), b0Var2);
                if (abstractC1586xI3 == null) {
                    c2295v4 = null;
                } else {
                    c2295v6.N0();
                    c2295v4 = new C2295v(c2263iP0, new C1013b(c2263iP0, abstractC1586xI3), c2295v6.getAnnotations());
                }
                c2295v2 = c2295v4;
            } else {
                c2295v2 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (C2295v c2295v7 : c2263i.f17378C) {
                AbstractC1586x abstractC1586xI4 = vA.i(c2295v7.getType(), b0.f13391n);
                if (abstractC1586xI4 == null) {
                    c2295v3 = null;
                } else {
                    W4.e eVarL0 = ((C1012a) c2295v7.N0()).L0();
                    c2295v7.N0();
                    c2295v3 = new C2295v(c2263iP0, new C1012a(c2263iP0, abstractC1586xI4, eVarL0), c2295v7.getAnnotations());
                }
                if (c2295v3 != null) {
                    arrayList2.add(c2295v3);
                }
            }
            c2263iP0.U0(abstractC1586xI, arrayList, c2295v, c2295v2, arrayList2);
            C2264J c2264j2 = c2263i.f17382G;
            if (c2264j2 == null) {
                c2264j = null;
            } else {
                v4.h annotations = c2264j2.getAnnotations();
                EnumC2117x enumC2117x2 = this.f17366b;
                H4.o visibility = c2263i.f17382G.getVisibility();
                if (this.f17369e == 2 && AbstractC2108n.e(AbstractC2108n.f(visibility.a.c()))) {
                    visibility = AbstractC2108n.f16325h;
                }
                H4.o oVar2 = visibility;
                C2264J c2264j3 = c2263i.f17382G;
                boolean z7 = c2264j3.f17358o;
                int i8 = this.f17369e;
                u4.K k8 = this.f17368d;
                c2264j = new C2264J(c2263iP0, annotations, enumC2117x2, oVar2, z7, c2264j3.f17359p, c2264j3.f17362s, i8, k8 == null ? null : k8.getGetter(), n7);
            }
            if (c2264j != null) {
                C2264J c2264j4 = c2263i.f17382G;
                AbstractC1586x abstractC1586x2 = c2264j4.f17395w;
                c2264j.f17365v = C2263I.Q0(vA, c2264j4);
                c2264j.Q0(abstractC1586x2 != null ? vA.i(abstractC1586x2, b0.f13392o) : null);
            }
            C2265K c2265k2 = c2263i.f17383H;
            if (c2265k2 == null) {
                c2265k = null;
            } else {
                v4.h annotations2 = c2265k2.getAnnotations();
                EnumC2117x enumC2117x3 = this.f17366b;
                H4.o visibility2 = c2263i.f17383H.getVisibility();
                if (this.f17369e == 2 && AbstractC2108n.e(AbstractC2108n.f(visibility2.a.c()))) {
                    visibility2 = AbstractC2108n.f16325h;
                }
                H4.o oVar3 = visibility2;
                C2265K c2265k3 = c2263i.f17383H;
                boolean z8 = c2265k3.f17358o;
                int i9 = this.f17369e;
                u4.K k9 = this.f17368d;
                c2265k = new C2265K(c2263iP0, annotations2, enumC2117x3, oVar3, z8, c2265k3.f17359p, c2265k3.f17362s, i9, k9 == null ? null : k9.getSetter(), n7);
            }
            if (c2265k != null) {
                v5 = vA;
                List listR0 = AbstractC2294u.R0(c2265k, c2263i.f17383H.m0(), v5, false, false, null);
                if (listR0 == null) {
                    listR0 = Collections.singletonList(C2265K.P0(c2265k, d5.e.e(this.a).n(), ((C2272S) c2263i.f17383H.m0().get(0)).getAnnotations()));
                }
                if (listR0.size() != 1) {
                    throw new IllegalStateException();
                }
                c2265k.f17365v = C2263I.Q0(v5, c2263i.f17383H);
                C2272S c2272s = (C2272S) listR0.get(0);
                if (c2272s == null) {
                    C2265K.s0(6);
                    throw null;
                }
                c2265k.f17397w = c2272s;
            } else {
                v5 = vA;
            }
            C2292s c2292s = c2263i.I;
            C2292s c2292s2 = c2292s == null ? null : new C2292s(c2292s.getAnnotations(), c2263iP0);
            C2292s c2292s3 = c2263i.J;
            c2263iP0.R0(c2264j, c2265k, c2292s2, c2292s3 != null ? new C2292s(c2292s3.getAnnotations(), c2263iP0) : null);
            if (this.f17371g) {
                w5.h hVar = new w5.h();
                Iterator it = c2263i.m().iterator();
                while (it.hasNext()) {
                    hVar.add(((u4.K) it.next()).b(v5));
                }
                c2263iP0.f17389u = hVar;
            }
            if (c2263i.isConst() && (interfaceC0821a = c2263i.f17386r) != null) {
                c2263iP0.S0(c2263i.f17385q, interfaceC0821a);
            }
            return c2263iP0;
        }
        return null;
    }
}
