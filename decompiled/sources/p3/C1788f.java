package p3;

import H5.A;
import O3.C;
import U3.j;
import e4.InterfaceC0821a;
import e4.n;
import io.github.jan.supabase.SupabaseClient;
import kotlin.jvm.internal.x;

/* renamed from: p3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1788f extends j implements n {

    /* renamed from: k, reason: collision with root package name */
    public int f14344k;

    /* renamed from: l, reason: collision with root package name */
    public x f14345l;

    /* renamed from: m, reason: collision with root package name */
    public int f14346m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ SupabaseClient f14347n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1789g f14348o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f14349p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1788f(SupabaseClient supabaseClient, C1789g c1789g, InterfaceC0821a interfaceC0821a, S3.c cVar) {
        super(2, cVar);
        this.f14347n = supabaseClient;
        this.f14348o = c1789g;
        this.f14349p = interfaceC0821a;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        return new C1788f(this.f14347n, this.f14348o, this.f14349p, cVar);
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1788f) create((A) obj, (S3.c) obj2)).invokeSuspend(C.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:18|(1:20)|39|21) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (H5.D.k(500, r9) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (io.github.jan.supabase.auth.AuthKt.getAuth(r9.f14347n).currentSessionOrNull() != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r10.refresh(r9) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003e -> B:16:0x0041). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r9.f14346m
            O3.C r2 = O3.C.a
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            P3.r.Y(r10)
            goto L74
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            int r1 = r9.f14344k
            kotlin.jvm.internal.x r6 = r9.f14345l
            P3.r.Y(r10)
            goto L41
        L23:
            P3.r.Y(r10)
            kotlin.jvm.internal.x r10 = new kotlin.jvm.internal.x
            r10.<init>()
            r1 = 0
            r6 = r10
        L2d:
            r10 = 300000(0x493e0, float:4.2039E-40)
            if (r1 >= r10) goto L59
            r9.f14345l = r6
            r9.f14344k = r1
            r9.f14346m = r4
            r7 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r10 = H5.D.k(r7, r9)
            if (r10 != r0) goto L41
            goto L73
        L41:
            int r1 = r1 + 500
            boolean r10 = o3.AbstractC1634a.f13599d
            if (r10 != 0) goto L59
            java.lang.String r10 = o3.AbstractC1634a.f13600e
            if (r10 == 0) goto L4d
            r6.f12720k = r10
        L4d:
            io.github.jan.supabase.SupabaseClient r10 = r9.f14347n     // Catch: java.lang.Throwable -> L2d
            io.github.jan.supabase.auth.Auth r10 = io.github.jan.supabase.auth.AuthKt.getAuth(r10)     // Catch: java.lang.Throwable -> L2d
            io.github.jan.supabase.auth.user.UserSession r10 = r10.currentSessionOrNull()     // Catch: java.lang.Throwable -> L2d
            if (r10 == 0) goto L2d
        L59:
            io.github.jan.supabase.SupabaseClient r10 = r9.f14347n     // Catch: java.lang.Throwable -> L92
            io.github.jan.supabase.auth.Auth r10 = io.github.jan.supabase.auth.AuthKt.getAuth(r10)     // Catch: java.lang.Throwable -> L92
            io.github.jan.supabase.auth.user.UserSession r10 = r10.currentSessionOrNull()     // Catch: java.lang.Throwable -> L92
            if (r10 == 0) goto L92
            com.kusukanime.data.SessionGate r10 = com.kusukanime.data.SessionGate.INSTANCE
            r9.f14345l = r5
            r9.f14344k = r1
            r9.f14346m = r3
            java.lang.Object r10 = r10.refresh(r9)
            if (r10 != r0) goto L74
        L73:
            return r0
        L74:
            p3.g r10 = r9.f14348o
            K5.Y r10 = r10.f14352d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.getClass()
            r10.i(r5, r0)
            p3.g r10 = r9.f14348o
            K5.Y r10 = r10.f14350b
            p3.c r0 = p3.C1785c.a
            r10.getClass()
            r10.i(r5, r0)
            e4.a r10 = r9.f14349p
            r10.invoke()
            return r2
        L92:
            p3.g r10 = r9.f14348o
            K5.Y r10 = r10.f14350b
            p3.b r0 = new p3.b
            java.lang.Object r1 = r6.f12720k
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto La0
            java.lang.String r1 = "Login belum selesai — balik ke app setelah memberi izin."
        La0:
            r0.<init>(r1)
            r10.getClass()
            r10.i(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.C1788f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
