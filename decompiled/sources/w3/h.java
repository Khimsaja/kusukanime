package w3;

import H5.A;
import K5.Y;
import O3.C;
import android.content.Context;
import com.kusukanime.data.ProfileRow;
import com.kusukanime.data.UserRepo;
import z5.AbstractC2510o;

/* loaded from: classes.dex */
public final class h extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public int f16969k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f16970l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f16971m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f16972n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f16973o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ byte[] f16974p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f16975q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, String str, Context context, String str2, byte[] bArr, String str3, S3.c cVar) {
        super(2, cVar);
        this.f16970l = jVar;
        this.f16971m = str;
        this.f16972n = context;
        this.f16973o = str2;
        this.f16974p = bArr;
        this.f16975q = str3;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new h(this.f16970l, this.f16971m, this.f16972n, this.f16973o, this.f16974p, this.f16975q, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    @Override // U3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objUpdateProfile$default;
        ProfileRow profileRow;
        T3.a aVar = T3.a.f9048k;
        int i7 = this.f16969k;
        j jVar = this.f16970l;
        Y y7 = jVar.f16984f;
        Y y8 = jVar.f16982d;
        try {
            if (i7 == 0) {
                P3.r.Y(obj);
                Boolean bool = Boolean.TRUE;
                y8.getClass();
                y8.i(null, bool);
                y7.h(null);
                String str = this.f16971m;
                if (AbstractC2510o.g0(str)) {
                    throw new IllegalStateException("Nama tidak boleh kosong");
                }
                UserRepo userRepo = jVar.f16980b;
                Context context = this.f16972n;
                String str2 = this.f16973o;
                byte[] bArr = this.f16974p;
                String str3 = this.f16975q;
                this.f16969k = 1;
                objUpdateProfile$default = UserRepo.updateProfile$default(userRepo, context, str, str2, bArr, str3, null, this, 32, null);
                if (objUpdateProfile$default == aVar) {
                    return aVar;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                P3.r.Y(obj);
                objUpdateProfile$default = obj;
            }
            profileRow = (ProfileRow) objUpdateProfile$default;
        } catch (Throwable th) {
            String message = th.getMessage();
            String str4 = message != null ? message : "Gagal menyimpan profil";
            y7.getClass();
            y7.i(null, str4);
        }
        if (profileRow == null) {
            throw new IllegalStateException("Gagal menyimpan profil");
        }
        Y y9 = jVar.f16986h;
        y9.getClass();
        y9.i(null, profileRow);
        Boolean bool2 = Boolean.FALSE;
        y8.getClass();
        y8.i(null, bool2);
        return C.a;
    }
}
