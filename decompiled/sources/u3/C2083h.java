package u3;

import H5.A;
import K5.Y;
import O3.C;
import P3.r;
import P3.y;
import U3.j;
import com.kusukanime.data.SessionGate;
import com.kusukanime.data.UserRepo;
import e4.n;

/* renamed from: u3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2083h extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public Y f16271k;

    /* renamed from: l, reason: collision with root package name */
    public int f16272l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2084i f16273m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2083h(C2084i c2084i, S3.c cVar) {
        super(2, cVar);
        this.f16273m = c2084i;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C2083h(this.f16273m, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2083h) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean zBooleanValue;
        Y y7;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16272l;
        C c2 = C.a;
        y yVar = y.f7779k;
        C2084i c2084i = this.f16273m;
        try {
            try {
            } catch (Throwable th) {
                Y y8 = c2084i.f16274b;
                y8.getClass();
                y8.i(null, yVar);
                String message = th.getMessage();
                if (message == null) {
                    message = "Gagal memuat riwayat";
                }
                Y y9 = c2084i.f16280h;
                y9.getClass();
                y9.i(null, message);
            }
        } catch (Throwable unused) {
            zBooleanValue = false;
        }
        if (i7 == 0) {
            r.Y(obj);
            Y y10 = c2084i.f16276d;
            Boolean bool = Boolean.TRUE;
            y10.getClass();
            y10.i(null, bool);
            c2084i.f16280h.h(null);
            SessionGate sessionGate = SessionGate.INSTANCE;
            this.f16272l = 1;
            obj = sessionGate.ensure(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y7 = this.f16271k;
                r.Y(obj);
                y7.h(obj);
                Y y11 = c2084i.f16276d;
                Boolean bool2 = Boolean.FALSE;
                y11.getClass();
                y11.i(null, bool2);
                return c2;
            }
            r.Y(obj);
        }
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (!zBooleanValue) {
            Y y12 = c2084i.f16278f;
            Boolean bool3 = Boolean.TRUE;
            y12.getClass();
            y12.i(null, bool3);
            Y y13 = c2084i.f16274b;
            y13.getClass();
            y13.i(null, yVar);
            Boolean bool4 = Boolean.FALSE;
            Y y14 = c2084i.f16276d;
            y14.getClass();
            y14.i(null, bool4);
            return c2;
        }
        Y y15 = c2084i.f16278f;
        Boolean bool5 = Boolean.FALSE;
        y15.getClass();
        y15.i(null, bool5);
        Y y16 = c2084i.f16274b;
        UserRepo userRepo = c2084i.f16282j;
        this.f16271k = y16;
        this.f16272l = 2;
        Object objHistory = userRepo.history(100, this);
        if (objHistory != aVar) {
            y7 = y16;
            obj = objHistory;
            y7.h(obj);
            Y y112 = c2084i.f16276d;
            Boolean bool22 = Boolean.FALSE;
            y112.getClass();
            y112.i(null, bool22);
            return c2;
        }
        return aVar;
    }
}
