package s3;

import O.Z;
import android.content.Context;
import com.kusukanime.data.UserRepo;
import e4.InterfaceC0821a;

/* renamed from: s3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2009p implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15761k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f15762l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z f15763m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f15764n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f15765o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f15766p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f15767q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f15768r;

    public /* synthetic */ C2009p(H5.A a, Context context, String str, Z z7, Z z8, Z z9, Z z10) {
        this.f15765o = a;
        this.f15766p = context;
        this.f15762l = str;
        this.f15763m = z7;
        this.f15764n = z8;
        this.f15767q = z9;
        this.f15768r = z10;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f15761k) {
            case 0:
                if (((Boolean) this.f15763m.getValue()).booleanValue()) {
                    ((InterfaceC0821a) this.f15766p).invoke();
                    H5.D.x((M5.c) this.f15767q, null, new w((UserRepo) this.f15768r, this.f15762l, this.f15764n, null), 3);
                } else {
                    ((InterfaceC0821a) this.f15765o).invoke();
                }
                break;
            default:
                H5.D.x((H5.A) this.f15765o, null, new C1987D((Context) this.f15766p, this.f15762l, this.f15763m, this.f15764n, (Z) this.f15767q, (Z) this.f15768r, null), 3);
                break;
        }
        return O3.C.a;
    }

    public /* synthetic */ C2009p(M5.c cVar, Z z7, Z z8, UserRepo userRepo, InterfaceC0821a interfaceC0821a, InterfaceC0821a interfaceC0821a2, String str) {
        this.f15765o = interfaceC0821a;
        this.f15766p = interfaceC0821a2;
        this.f15767q = cVar;
        this.f15763m = z7;
        this.f15768r = userRepo;
        this.f15762l = str;
        this.f15764n = z8;
    }
}
