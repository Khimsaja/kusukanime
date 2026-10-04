package n5;

import io.ktor.http.LinkHeader;

/* loaded from: classes.dex */
public final class K extends AbstractC1566c {

    /* renamed from: b, reason: collision with root package name */
    public static final K f13365b = new K(0);

    /* renamed from: c, reason: collision with root package name */
    public static final K f13366c = new K(1);

    /* renamed from: d, reason: collision with root package name */
    public static final K f13367d = new K(2);
    public final /* synthetic */ int a;

    public /* synthetic */ K(int i7) {
        this.a = i7;
    }

    @Override // n5.AbstractC1566c
    public final q5.e E(L l7, q5.d dVar) {
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.l.f("state", l7);
                kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, dVar);
                return l7.f13369c.O0(dVar);
            case 1:
                kotlin.jvm.internal.l.f("state", l7);
                kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, dVar);
                throw new UnsupportedOperationException("Should not be called");
            default:
                kotlin.jvm.internal.l.f("state", l7);
                kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, dVar);
                return l7.f13369c.E(dVar);
        }
    }
}
