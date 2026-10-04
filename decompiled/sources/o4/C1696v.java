package o4;

import j5.C1365t;
import java.util.HashSet;

/* renamed from: o4.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1696v implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public static final C1696v f13762l = new C1696v(0);

    /* renamed from: m, reason: collision with root package name */
    public static final C1696v f13763m = new C1696v(1);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13764k;

    public /* synthetic */ C1696v(int i7) {
        this.f13764k = i7;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C1365t c1365t = (C1365t) obj;
        R4.J j7 = (R4.J) obj2;
        switch (this.f13764k) {
            case 0:
                HashSet hashSet = C1649C.f13627n;
                kotlin.jvm.internal.l.f("$this$deserializeToDescriptor", c1365t);
                kotlin.jvm.internal.l.f("proto", j7);
                break;
            default:
                int i7 = X.f13667n;
                kotlin.jvm.internal.l.f("$this$deserializeToDescriptor", c1365t);
                kotlin.jvm.internal.l.f("proto", j7);
                break;
        }
        return c1365t.g(j7, true);
    }
}
