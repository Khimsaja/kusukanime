package V2;

import H5.A;
import O3.C;
import P3.r;
import e4.n;
import java.io.IOException;
import w6.AbstractC2217b;
import w6.C2222g;

/* loaded from: classes.dex */
public final class f extends U3.j implements n {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g f9458k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, S3.c cVar) {
        super(2, cVar);
        this.f9458k = gVar;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new f(this.f9458k, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        T3.a aVar = T3.a.f9048k;
        r.Y(obj);
        g gVar = this.f9458k;
        synchronized (gVar) {
            if (!gVar.f9471v || gVar.f9472w) {
                return C.a;
            }
            try {
                gVar.J();
            } catch (IOException unused) {
                gVar.f9473x = true;
            }
            try {
                if (gVar.f9468s >= 2000) {
                    gVar.O();
                }
            } catch (IOException unused2) {
                gVar.f9474y = true;
                gVar.f9469t = AbstractC2217b.b(new C2222g());
            }
            return C.a;
        }
    }
}
