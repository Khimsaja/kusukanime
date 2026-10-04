package a0;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public static final j f10398l = new j(2);

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        o oVar = (o) obj2;
        if (str.length() == 0) {
            return oVar.toString();
        }
        return str + ", " + oVar;
    }
}
