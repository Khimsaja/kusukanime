package A4;

import java.lang.reflect.Member;

/* loaded from: classes.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.j implements e4.k {

    /* renamed from: k, reason: collision with root package name */
    public static final m f230k = new m(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);

    @Override // e4.k
    public final Object invoke(Object obj) {
        Member member = (Member) obj;
        kotlin.jvm.internal.l.f("p0", member);
        return Boolean.valueOf(member.isSynthetic());
    }
}
