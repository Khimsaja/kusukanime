package q3;

import H5.A;
import K5.Y;
import O3.C;
import P3.r;
import P3.y;
import U3.j;
import com.kusukanime.data.SessionGate;
import com.kusukanime.data.UserRepo;
import e4.n;

/* renamed from: q3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1854e extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public Y f14731k;

    /* renamed from: l, reason: collision with root package name */
    public int f14732l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1855f f14733m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1854e(C1855f c1855f, S3.c cVar) {
        super(2, cVar);
        this.f14733m = c1855f;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1854e(this.f14733m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1854e) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        Y y7;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f14732l;
        C c2 = C.a;
        y yVar = y.f7779k;
        C1855f c1855f = this.f14733m;
        try {
            try {
            } catch (Throwable th) {
                Y y8 = c1855f.f14734b;
                y8.getClass();
                y8.i(null, yVar);
                String message = th.getMessage();
                if (message == null) {
                    message = "Gagal memuat simpanan";
                }
                Y y9 = c1855f.f14740h;
                y9.getClass();
                y9.i(null, message);
            }
        } catch (Throwable unused) {
            zBooleanValue = false;
        }
        if (i7 == 0) {
            r.Y(obj);
            Y y10 = c1855f.f14736d;
            Boolean bool = Boolean.TRUE;
            y10.getClass();
            y10.i(null, bool);
            c1855f.f14740h.h(null);
            SessionGate sessionGate = SessionGate.INSTANCE;
            this.f14732l = 1;
            obj = sessionGate.ensure(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7 = this.f14731k;
                r.Y(obj);
                y7.h(obj);
                Y y11 = c1855f.f14736d;
                Boolean bool2 = Boolean.FALSE;
                y11.getClass();
                y11.i(null, bool2);
                return c2;
            }
            r.Y(obj);
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (!zBooleanValue) {
            Y y12 = c1855f.f14738f;
            Boolean bool3 = Boolean.TRUE;
            y12.getClass();
            y12.i(null, bool3);
            Y y13 = c1855f.f14734b;
            y13.getClass();
            y13.i(null, yVar);
            Boolean bool4 = Boolean.FALSE;
            Y y14 = c1855f.f14736d;
            y14.getClass();
            y14.i(null, bool4);
            return c2;
        }
        Y y15 = c1855f.f14738f;
        Boolean bool5 = Boolean.FALSE;
        y15.getClass();
        y15.i(null, bool5);
        Y y16 = c1855f.f14734b;
        UserRepo userRepo = c1855f.f14742j;
        this.f14731k = y16;
        this.f14732l = 2;
        Object objBookmarks = userRepo.bookmarks(this);
        if (objBookmarks != aVar) {
            y7 = y16;
            obj = objBookmarks;
            y7.h(obj);
            Y y112 = c1855f.f14736d;
            Boolean bool22 = Boolean.FALSE;
            y112.getClass();
            y112.i(null, bool22);
            return c2;
        }
        return aVar;
    }
}
