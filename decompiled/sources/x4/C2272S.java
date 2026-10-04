package x4;

import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import n5.AbstractC1586x;
import n5.V;
import u4.AbstractC2108n;
import u4.InterfaceC2093I;
import u4.InterfaceC2096b;
import u4.InterfaceC2097c;
import u4.InterfaceC2105k;
import u4.InterfaceC2106l;
import u4.U;

/* renamed from: x4.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2272S extends AbstractC2273T implements InterfaceC2093I, U {

    /* renamed from: p, reason: collision with root package name */
    public final int f17408p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f17409q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f17410r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f17411s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC1586x f17412t;

    /* renamed from: u, reason: collision with root package name */
    public final C2272S f17413u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2272S(InterfaceC2096b interfaceC2096b, C2272S c2272s, int i7, v4.h hVar, W4.e eVar, AbstractC1586x abstractC1586x, boolean z7, boolean z8, boolean z9, AbstractC1586x abstractC1586x2, u4.M m7) {
        super(interfaceC2096b, hVar, eVar, abstractC1586x, m7);
        kotlin.jvm.internal.l.f("containingDeclaration", interfaceC2096b);
        kotlin.jvm.internal.l.f("annotations", hVar);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, eVar);
        kotlin.jvm.internal.l.f("outType", abstractC1586x);
        kotlin.jvm.internal.l.f("source", m7);
        this.f17408p = i7;
        this.f17409q = z7;
        this.f17410r = z8;
        this.f17411s = z9;
        this.f17412t = abstractC1586x2;
        this.f17413u = c2272s == null ? this : c2272s;
    }

    @Override // u4.U
    public final boolean A() {
        return false;
    }

    public C2272S N0(s4.f fVar, W4.e eVar, int i7) {
        v4.h annotations = getAnnotations();
        kotlin.jvm.internal.l.e("<get-annotations>(...)", annotations);
        AbstractC1586x type = getType();
        kotlin.jvm.internal.l.e("getType(...)", type);
        boolean zO0 = O0();
        u4.N n7 = u4.M.f16295i;
        return new C2272S(fVar, null, i7, annotations, eVar, type, zO0, this.f17410r, this.f17411s, this.f17412t, n7);
    }

    public final boolean O0() {
        return this.f17409q && ((InterfaceC2097c) k()).c() != 2;
    }

    @Override // x4.AbstractC2288o, u4.InterfaceC2105k
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2096b k() {
        InterfaceC2105k interfaceC2105kK = super.k();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor", interfaceC2105kK);
        return (InterfaceC2096b) interfaceC2105kK;
    }

    @Override // x4.AbstractC2288o, x4.AbstractC2287n, u4.InterfaceC2105k
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final C2272S a() {
        C2272S c2272s = this.f17413u;
        return c2272s == this ? this : c2272s.a();
    }

    @Override // u4.O
    public final InterfaceC2106l b(V v5) {
        kotlin.jvm.internal.l.f("substitutor", v5);
        if (v5.a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // u4.InterfaceC2107m
    public final H4.o getVisibility() {
        H4.o oVar = AbstractC2108n.f16323f;
        kotlin.jvm.internal.l.e("LOCAL", oVar);
        return oVar;
    }

    @Override // u4.U
    public final /* bridge */ /* synthetic */ b5.g h0() {
        return null;
    }

    @Override // u4.InterfaceC2096b
    public final Collection m() {
        Collection collectionM = k().m();
        kotlin.jvm.internal.l.e("getOverriddenDescriptors(...)", collectionM);
        Collection collection = collectionM;
        ArrayList arrayList = new ArrayList(P3.r.p(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((C2272S) ((InterfaceC2096b) it.next()).m0().get(this.f17408p));
        }
        return arrayList;
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        switch (yVar.f9915k) {
            case 1:
                ((Y4.h) yVar.f9916l).b0(this, true, (StringBuilder) obj, true);
                return O3.C.a;
            default:
                return null;
        }
    }
}
