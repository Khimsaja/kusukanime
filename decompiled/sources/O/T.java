package O;

import io.ktor.util.GzipHeaderFlags;

/* loaded from: classes.dex */
public final class T implements S3.g, I0 {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ T f7045l = new T(0);

    /* renamed from: m, reason: collision with root package name */
    public static final T f7046m = new T(1);

    /* renamed from: n, reason: collision with root package name */
    public static final T f7047n = new T(2);

    /* renamed from: o, reason: collision with root package name */
    public static final T f7048o = new T(3);

    /* renamed from: p, reason: collision with root package name */
    public static final T f7049p = new T(4);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f7050k;

    public /* synthetic */ T(int i7) {
        this.f7050k = i7;
    }

    public static final void b(T t7) {
        K5.Y y7;
        Object obj;
        U.b bVar;
        K5.Y y8 = C0522v0.f7219v;
        do {
            y7 = C0522v0.f7219v;
            obj = (R.a) y7.getValue();
            bVar = (U.b) obj;
            T.b bVarH = bVar.f9124m;
            U.a aVar = (U.a) bVarH.get(t7);
            if (aVar != null) {
                int iHashCode = t7 != null ? t7.hashCode() : 0;
                T.h hVar = bVarH.f8818k;
                T.h hVarV = hVar.v(iHashCode, t7, 0);
                if (hVar != hVarV) {
                    bVarH = hVarV == null ? T.b.f8817m : new T.b(hVarV, bVarH.f8819l - 1);
                }
                V.b bVar2 = V.b.a;
                Object obj2 = aVar.a;
                boolean z7 = obj2 != bVar2;
                Object obj3 = aVar.f9120b;
                if (z7) {
                    Object obj4 = bVarH.get(obj2);
                    kotlin.jvm.internal.l.c(obj4);
                    bVarH = bVarH.h(obj2, new U.a(((U.a) obj4).a, obj3));
                }
                if (obj3 != bVar2) {
                    Object obj5 = bVarH.get(obj3);
                    kotlin.jvm.internal.l.c(obj5);
                    bVarH = bVarH.h(obj3, new U.a(obj2, ((U.a) obj5).f9120b));
                }
                Object obj6 = obj2 != bVar2 ? bVar.f9122k : obj3;
                if (obj3 != bVar2) {
                    obj2 = bVar.f9123l;
                }
                bVar = new U.b(obj6, obj2, bVarH);
            }
            if (obj == bVar) {
                return;
            }
            Object obj7 = L5.c.f6161b;
            if (obj == null) {
                obj = obj7;
            }
        } while (!y7.i(obj, bVar));
    }

    @Override // O.I0
    public boolean a(Object obj, Object obj2) {
        switch (this.f7050k) {
            case 1:
                return false;
            case 2:
                return obj == obj2;
            default:
                return kotlin.jvm.internal.l.a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f7050k) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            default:
                return super.toString();
            case GzipHeaderFlags.EXTRA /* 4 */:
                return "StructuralEqualityPolicy";
            case 5:
                return "Empty";
        }
    }
}
