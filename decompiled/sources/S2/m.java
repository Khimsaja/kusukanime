package S2;

import B1.C0017d;
import H5.D;
import H5.M;
import H5.v0;
import O3.q;
import P3.F;
import a3.C0662a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import d3.C0791c;
import d3.C0793e;
import d3.C0797i;
import f6.AbstractC0905c;
import f6.C0922t;
import g3.C0949h;
import g3.ComponentCallbacks2C0951j;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class m implements f {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final C0791c f8757b;

    /* renamed from: c, reason: collision with root package name */
    public final q f8758c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8759d;

    /* renamed from: e, reason: collision with root package name */
    public final C0949h f8760e;

    /* renamed from: f, reason: collision with root package name */
    public final L2.e f8761f;

    /* renamed from: g, reason: collision with root package name */
    public final b f8762g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f8763h;

    public m(Context context, C0791c c0791c, q qVar, q qVar2, O3.i iVar, b bVar, C0949h c0949h) {
        int i7 = 3;
        int i8 = 4;
        int i9 = 5;
        int i10 = 0;
        this.a = context;
        this.f8757b = c0791c;
        this.f8758c = qVar;
        this.f8759d = iVar;
        this.f8760e = c0949h;
        v0 v0VarE = D.e();
        O5.e eVar = M.a;
        D.c(F.M(v0VarE, M5.m.a.f4075o).plus(new l(this)));
        ComponentCallbacks2C0951j componentCallbacks2C0951j = new ComponentCallbacks2C0951j(this);
        L2.e eVar2 = new L2.e(this, componentCallbacks2C0951j);
        this.f8761f = eVar2;
        C0017d c0017d = new C0017d(bVar);
        c0017d.o(new C0662a(2), C0922t.class);
        c0017d.o(new C0662a(i9), String.class);
        c0017d.o(new C0662a(1), Uri.class);
        c0017d.o(new C0662a(i8), Uri.class);
        c0017d.o(new C0662a(i7), Integer.class);
        c0017d.o(new C0662a(i10), byte[].class);
        Z2.c cVar = new Z2.c();
        ArrayList arrayList = (ArrayList) c0017d.f320n;
        arrayList.add(new O3.l(cVar, Uri.class));
        arrayList.add(new O3.l(new Z2.a(c0949h.a), File.class));
        c0017d.h(new X2.i(iVar, qVar2, c0949h.f11712c), Uri.class);
        c0017d.h(new X2.a(i9), File.class);
        c0017d.h(new X2.a(i10), Uri.class);
        c0017d.h(new X2.a(i7), Uri.class);
        c0017d.h(new X2.a(6), Uri.class);
        c0017d.h(new X2.a(i8), Drawable.class);
        c0017d.h(new X2.a(1), Bitmap.class);
        c0017d.h(new X2.a(2), ByteBuffer.class);
        U2.b bVar2 = new U2.b(c0949h.f11713d, c0949h.f11714e);
        ArrayList arrayList2 = (ArrayList) c0017d.f322p;
        arrayList2.add(bVar2);
        List listF = AbstractC0905c.F((ArrayList) c0017d.f318l);
        this.f8762g = new b(listF, AbstractC0905c.F((ArrayList) c0017d.f319m), AbstractC0905c.F(arrayList), AbstractC0905c.F((ArrayList) c0017d.f321o), AbstractC0905c.F(arrayList2));
        this.f8763h = P3.q.H0(listF, new Y2.h(this, componentCallbacks2C0951j, eVar2));
        new AtomicBoolean(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        if (e5.AbstractC0832b.i(r14, r0) == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0192 A[Catch: all -> 0x018f, TRY_ENTER, TryCatch #10 {all -> 0x018f, blocks: (B:95:0x0177, B:97:0x017b, B:102:0x0192, B:103:0x019b), top: B:124:0x0177 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d1 A[Catch: all -> 0x016d, TryCatch #9 {all -> 0x016d, blocks: (B:47:0x00c7, B:49:0x00d1, B:50:0x00d4, B:52:0x00de, B:54:0x00e4, B:56:0x00ea, B:57:0x00f0), top: B:122:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de A[Catch: all -> 0x016d, TryCatch #9 {all -> 0x016d, blocks: (B:47:0x00c7, B:49:0x00d1, B:50:0x00d4, B:52:0x00de, B:54:0x00e4, B:56:0x00ea, B:57:0x00f0), top: B:122:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0136 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #7 {all -> 0x014c, blocks: (B:69:0x0130, B:71:0x0136, B:79:0x014f, B:81:0x0153), top: B:120:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014f A[Catch: all -> 0x014c, TRY_ENTER, TryCatch #7 {all -> 0x014c, blocks: (B:69:0x0130, B:71:0x0136, B:79:0x014f, B:81:0x0153), top: B:120:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017b A[Catch: all -> 0x018f, TRY_LEAVE, TryCatch #10 {all -> 0x018f, blocks: (B:95:0x0177, B:97:0x017b, B:102:0x0192, B:103:0x019b), top: B:124:0x0177 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(S2.m r12, d3.C0797i r13, int r14, U3.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S2.m.a(S2.m, d3.i, int, U3.c):java.lang.Object");
    }

    public static void b(C0793e c0793e, T2.k kVar, c cVar) {
        C0797i c0797i = c0793e.f11258b;
        cVar.getClass();
        c0797i.getClass();
    }
}
