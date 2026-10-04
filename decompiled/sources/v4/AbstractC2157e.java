package v4;

import P3.E;
import P3.y;
import b5.C0719a;
import b5.w;
import io.ktor.http.ContentType;
import r4.AbstractC1880i;
import r4.AbstractC1886o;
import r4.C1878g;

/* renamed from: v4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2157e {
    public static final W4.e a = W4.e.e(ContentType.Message.TYPE);

    /* renamed from: b, reason: collision with root package name */
    public static final W4.e f16650b = W4.e.e("replaceWith");

    /* renamed from: c, reason: collision with root package name */
    public static final W4.e f16651c = W4.e.e("level");

    /* renamed from: d, reason: collision with root package name */
    public static final W4.e f16652d = W4.e.e("expression");

    /* renamed from: e, reason: collision with root package name */
    public static final W4.e f16653e = W4.e.e("imports");

    public static final j a(AbstractC1880i abstractC1880i, String str, String str2, String str3) {
        kotlin.jvm.internal.l.f("<this>", abstractC1880i);
        kotlin.jvm.internal.l.f(ContentType.Message.TYPE, str);
        kotlin.jvm.internal.l.f("replaceWith", str2);
        j jVar = new j(abstractC1880i, AbstractC1886o.f15007o, E.n0(new O3.l(f16652d, new w(str2)), new O3.l(f16653e, new b5.b(new C1878g(abstractC1880i, 1), y.f7779k))));
        W4.c cVar = AbstractC1886o.f15005m;
        O3.l lVar = new O3.l(a, new w(str));
        O3.l lVar2 = new O3.l(f16650b, new C0719a((Object) jVar));
        W4.c cVar2 = AbstractC1886o.f15006n;
        kotlin.jvm.internal.l.f("topLevelFqName", cVar2);
        return new j(abstractC1880i, cVar, E.n0(lVar, lVar2, new O3.l(f16651c, new b5.i(new W4.b(cVar2.b(), cVar2.a.g()), W4.e.e(str3)))));
    }
}
