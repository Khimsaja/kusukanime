package F0;

import O3.C;
import io.ktor.util.GzipHeaderFlags;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: m, reason: collision with root package name */
    public static final p f2109m = new p(2, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final p f2110n = new p(2, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final p f2111o = new p(2, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final p f2112p = new p(2, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final p f2113q = new p(2, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final p f2114r = new p(2, 5);

    /* renamed from: s, reason: collision with root package name */
    public static final p f2115s = new p(2, 6);

    /* renamed from: t, reason: collision with root package name */
    public static final p f2116t = new p(2, 7);

    /* renamed from: u, reason: collision with root package name */
    public static final p f2117u = new p(2, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final p f2118v = new p(2, 9);

    /* renamed from: w, reason: collision with root package name */
    public static final p f2119w = new p(2, 10);

    /* renamed from: x, reason: collision with root package name */
    public static final p f2120x = new p(2, 11);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2121l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i7, int i8) {
        super(i7);
        this.f2121l = i8;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        String str;
        O3.e eVar;
        switch (this.f2121l) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayListU0 = P3.q.U0(list);
                arrayListU0.addAll(list2);
                return arrayListU0;
            case 1:
                return (C) obj;
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 3:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case GzipHeaderFlags.EXTRA /* 4 */:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 5:
                f fVar = (f) obj;
                int i7 = ((f) obj2).a;
                return fVar;
            case 6:
                return (String) obj;
            case 7:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList arrayListU02 = P3.q.U0(list3);
                arrayListU02.addAll(list4);
                return arrayListU02;
            case 8:
                Float f5 = (Float) obj;
                ((Number) obj2).floatValue();
                return f5;
            case 9:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 10:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.a) == null) {
                    str = aVar2.a;
                }
                if (aVar == null || (eVar = aVar.f2062b) == null) {
                    eVar = aVar2.f2062b;
                }
                return new a(str, eVar);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
