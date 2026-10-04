package z0;

import K5.InterfaceC0330i;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class i1 extends U3.j implements e4.n {

    /* renamed from: k, reason: collision with root package name */
    public J5.d f18772k;

    /* renamed from: l, reason: collision with root package name */
    public int f18773l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f18774m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ContentResolver f18775n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Uri f18776o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j1 f18777p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ J5.e f18778q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f18779r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(ContentResolver contentResolver, Uri uri, j1 j1Var, J5.e eVar, Context context, S3.c cVar) {
        super(2, cVar);
        this.f18775n = contentResolver;
        this.f18776o = uri;
        this.f18777p = j1Var;
        this.f18778q = eVar;
        this.f18779r = context;
    }

    @Override // U3.a
    public final S3.c create(Object obj, S3.c cVar) {
        J5.e eVar = this.f18778q;
        i1 i1Var = new i1(this.f18775n, this.f18776o, this.f18777p, eVar, this.f18779r, cVar);
        i1Var.f18774m = obj;
        return i1Var;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        return ((i1) create((InterfaceC0330i) obj, (S3.c) obj2)).invokeSuspend(O3.C.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r6.emit(r7, r10) == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:7:0x0016, B:18:0x0044, B:22:0x0055, B:24:0x005d, B:14:0x002c, B:17:0x003d), top: B:31:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007d -> B:8:0x0019). Please report as a decompilation issue!!! */
    @Override // U3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            T3.a r0 = T3.a.f9048k
            int r1 = r10.f18773l
            z0.j1 r2 = r10.f18777p
            r3 = 2
            r4 = 1
            android.content.ContentResolver r5 = r10.f18775n
            if (r1 == 0) goto L30
            if (r1 == r4) goto L26
            if (r1 != r3) goto L1e
            J5.d r1 = r10.f18772k
            java.lang.Object r6 = r10.f18774m
            K5.i r6 = (K5.InterfaceC0330i) r6
            P3.r.Y(r11)     // Catch: java.lang.Throwable -> L1c
        L19:
            r11 = r6
            r6 = r1
            goto L44
        L1c:
            r11 = move-exception
            goto L86
        L1e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L26:
            J5.d r1 = r10.f18772k
            java.lang.Object r6 = r10.f18774m
            K5.i r6 = (K5.InterfaceC0330i) r6
            P3.r.Y(r11)     // Catch: java.lang.Throwable -> L1c
            goto L55
        L30:
            P3.r.Y(r11)
            java.lang.Object r11 = r10.f18774m
            K5.i r11 = (K5.InterfaceC0330i) r11
            android.net.Uri r1 = r10.f18776o
            r6 = 0
            r5.registerContentObserver(r1, r6, r2)
            J5.e r1 = r10.f18778q     // Catch: java.lang.Throwable -> L1c
            J5.d r6 = new J5.d     // Catch: java.lang.Throwable -> L1c
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1c
        L44:
            r10.f18774m = r11     // Catch: java.lang.Throwable -> L1c
            r10.f18772k = r6     // Catch: java.lang.Throwable -> L1c
            r10.f18773l = r4     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r6.b(r10)     // Catch: java.lang.Throwable -> L1c
            if (r1 != r0) goto L51
            goto L7f
        L51:
            r9 = r6
            r6 = r11
            r11 = r1
            r1 = r9
        L55:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1c
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1c
            if (r11 == 0) goto L80
            r1.c()     // Catch: java.lang.Throwable -> L1c
            android.content.Context r11 = r10.f18779r     // Catch: java.lang.Throwable -> L1c
            android.content.ContentResolver r11 = r11.getContentResolver()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r7 = "animator_duration_scale"
            r8 = 1065353216(0x3f800000, float:1.0)
            float r11 = android.provider.Settings.Global.getFloat(r11, r7, r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.Float r7 = new java.lang.Float     // Catch: java.lang.Throwable -> L1c
            r7.<init>(r11)     // Catch: java.lang.Throwable -> L1c
            r10.f18774m = r6     // Catch: java.lang.Throwable -> L1c
            r10.f18772k = r1     // Catch: java.lang.Throwable -> L1c
            r10.f18773l = r3     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r11 = r6.emit(r7, r10)     // Catch: java.lang.Throwable -> L1c
            if (r11 != r0) goto L19
        L7f:
            return r0
        L80:
            r5.unregisterContentObserver(r2)
            O3.C r11 = O3.C.a
            return r11
        L86:
            r5.unregisterContentObserver(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.i1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
