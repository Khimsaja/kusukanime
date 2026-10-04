package b6;

import O3.C0553b;

/* renamed from: b6.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0724E extends U3.i implements e4.o {

    /* renamed from: k, reason: collision with root package name */
    public int f10970k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ C0553b f10971l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O4.c f10972m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0724E(O4.c cVar, S3.c cVar2) {
        super(3, cVar2);
        this.f10972m = cVar;
    }

    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C0724E c0724e = new C0724E(this.f10972m, (S3.c) obj3);
        c0724e.f10971l = (C0553b) obj;
        return c0724e.invokeSuspend(O3.C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0553b c0553b = this.f10971l;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f10970k;
        if (i7 == 0) {
            P3.r.Y(obj);
            O4.c cVar = this.f10972m;
            V1.i iVar = (V1.i) cVar.f7553c;
            byte bX = iVar.x();
            if (bX == 1) {
                return cVar.d(true);
            }
            if (bX == 0) {
                return cVar.d(false);
            }
            if (bX != 6) {
                if (bX == 8) {
                    return cVar.c();
                }
                V1.i.r(iVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f10971l = null;
            this.f10970k = 1;
            obj = O4.c.a(cVar, c0553b, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P3.r.Y(obj);
        }
        return (kotlinx.serialization.json.b) obj;
    }
}
