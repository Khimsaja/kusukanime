package i1;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class w extends U3.i implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f11986k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f11987l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f11988m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(View view, S3.c cVar) {
        super(2, cVar);
        this.f11988m = view;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        w wVar = new w(this.f11988m, cVar);
        wVar.f11987l = obj;
        return wVar;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((y5.j) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object obj3 = T3.a.f9048k;
        int i7 = this.f11986k;
        View view = this.f11988m;
        if (i7 == 0) {
            P3.r.Y(obj);
            y5.j jVar = (y5.j) this.f11987l;
            this.f11987l = jVar;
            this.f11986k = 1;
            jVar.a(view, this);
            return obj3;
        }
        Object obj4 = O3.C.a;
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
            return obj4;
        }
        y5.j jVar2 = (y5.j) this.f11987l;
        P3.r.Y(obj);
        if (view instanceof ViewGroup) {
            this.f11987l = null;
            this.f11986k = 2;
            jVar2.getClass();
            C1058k c1058k = new C1058k(new O3.t(6, (ViewGroup) view));
            y5.i iVar = (y5.i) jVar2;
            if (c1058k.f11978l.hasNext()) {
                iVar.f18387m = c1058k;
                iVar.f18385k = 2;
                iVar.f18388n = this;
                obj2 = obj3;
            } else {
                obj2 = obj4;
            }
            if (obj2 != obj3) {
                obj2 = obj4;
            }
            if (obj2 == obj3) {
                return obj3;
            }
        }
        return obj4;
    }
}
