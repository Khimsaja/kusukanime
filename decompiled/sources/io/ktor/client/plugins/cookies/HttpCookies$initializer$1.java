package io.ktor.client.plugins.cookies;

import H5.A;
import O3.C;
import P3.r;
import S3.c;
import U3.e;
import U3.j;
import e4.n;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LH5/A;", "LO3/C;", "<anonymous>", "(LH5/A;)V"}, k = 3, mv = {2, 1, 0})
@e(c = "io.ktor.client.plugins.cookies.HttpCookies$initializer$1", f = "HttpCookies.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HttpCookies$initializer$1 extends j implements n {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ HttpCookies this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCookies$initializer$1(HttpCookies httpCookies, c<? super HttpCookies$initializer$1> cVar) {
        super(2, cVar);
        this.this$0 = httpCookies;
    }

    @Override // U3.a
    public final c<C> create(Object obj, c<?> cVar) {
        return new HttpCookies$initializer$1(this.this$0, cVar);
    }

    @Override // e4.n
    public final Object invoke(A a, c<? super C> cVar) {
        return ((HttpCookies$initializer$1) create(a, cVar)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        HttpCookies httpCookies;
        Iterator it;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.label;
        if (i7 == 0) {
            r.Y(obj);
            List list = this.this$0.defaults;
            httpCookies = this.this$0;
            it = list.iterator();
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$1;
            httpCookies = (HttpCookies) this.L$0;
            r.Y(obj);
        }
        while (it.hasNext()) {
            n nVar = (n) it.next();
            CookiesStorage cookiesStorage = httpCookies.storage;
            this.L$0 = httpCookies;
            this.L$1 = it;
            this.label = 1;
            if (nVar.invoke(cookiesStorage, this) == aVar) {
                return aVar;
            }
        }
        return C.a;
    }
}
