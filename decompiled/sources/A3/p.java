package A3;

import O.Z;
import O3.C;
import X4.AbstractC0606c;
import android.content.Context;
import com.kusukanime.data.GenreItem;
import com.kusukanime.data.SearchHistory;
import e4.InterfaceC0821a;
import io.ktor.util.GzipHeaderFlags;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import l5.AbstractC1463p;
import m5.C1519h;
import m5.C1523l;
import m5.InterfaceC1526o;
import n5.AbstractC1586x;
import o4.C1649C;
import o4.C1700z;
import o4.F0;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;
import u4.N;
import x4.AbstractC2282i;
import x4.C2281h;

/* loaded from: classes.dex */
public final class p implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f174k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f175l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f176m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f177n;

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, int i7) {
        this.f174k = i7;
        this.f175l = obj;
        this.f176m = obj2;
        this.f177n = obj3;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f174k) {
            case 0:
                B b4 = (B) this.f175l;
                String str = (String) this.f176m;
                b4.f(str);
                Context context = b4.f130n;
                if (context != null) {
                    SearchHistory searchHistory = SearchHistory.INSTANCE;
                    searchHistory.add(context, str);
                    b4.f124h.h(searchHistory.list(context));
                }
                ((Z) this.f177n).setValue(Boolean.FALSE);
                return C.a;
            case 1:
                L4.z zVar = (L4.z) this.f175l;
                C1523l c1523l = ((K4.a) zVar.f6145b.f110l).a;
                q qVar = new q(zVar, (A4.v) this.f176m, (kotlin.jvm.internal.x) this.f177n);
                c1523l.getClass();
                return new C1519h(c1523l, qVar);
            case 2:
                return ((AbstractC0606c) this.f175l).b((ByteArrayInputStream) this.f176m, ((AbstractC1463p) this.f177n).f12815b.a.f12428p);
            case 3:
                InterfaceC2102h interfaceC2102hF = ((AbstractC1586x) this.f175l).t0().f();
                if (!(interfaceC2102hF instanceof InterfaceC2099e)) {
                    throw new H5.C("Supertype not a class: " + interfaceC2102hF);
                }
                Class clsJ = F0.j((InterfaceC2099e) interfaceC2102hF);
                C1700z c1700z = (C1700z) this.f176m;
                if (clsJ == null) {
                    throw new H5.C("Unsupported superclass of " + c1700z + ": " + interfaceC2102hF);
                }
                C1649C c1649c = (C1649C) this.f177n;
                boolean zA = kotlin.jvm.internal.l.a(c1649c.f13628l.getSuperclass(), clsJ);
                Class cls = c1649c.f13628l;
                if (zA) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    kotlin.jvm.internal.l.c(genericSuperclass);
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                kotlin.jvm.internal.l.e("getInterfaces(...)", interfaces);
                int iL0 = P3.m.l0(clsJ, interfaces);
                if (iL0 >= 0) {
                    Type type = cls.getGenericInterfaces()[iL0];
                    kotlin.jvm.internal.l.c(type);
                    return type;
                }
                throw new H5.C("No superclass of " + c1700z + " in Java reflection for " + interfaceC2102hF);
            case GzipHeaderFlags.EXTRA /* 4 */:
                GenreItem genreItem = (GenreItem) this.f175l;
                ((Z) this.f177n).setValue(genreItem.getSlug());
                ((t3.p) this.f176m).f(genreItem.getSlug());
                return C.a;
            default:
                return new C2281h((AbstractC2282i) this.f177n, (InterfaceC1526o) this.f175l, (N) this.f176m);
        }
    }

    public p(AbstractC2282i abstractC2282i, InterfaceC1526o interfaceC1526o, N n7) {
        this.f174k = 5;
        this.f177n = abstractC2282i;
        this.f175l = interfaceC1526o;
        this.f176m = n7;
    }
}
