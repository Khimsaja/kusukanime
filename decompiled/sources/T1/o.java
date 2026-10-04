package T1;

import B1.AbstractC0015b;
import B1.D;
import B1.F;
import B1.G;
import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import j3.X;
import java.util.concurrent.CopyOnWriteArraySet;
import y1.C2392n;

/* loaded from: classes.dex */
public final class o {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final G f8932b = new G(0, (byte) 0);

    /* renamed from: c, reason: collision with root package name */
    public final n f8933c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f8934d;

    /* renamed from: e, reason: collision with root package name */
    public final X f8935e;

    /* renamed from: f, reason: collision with root package name */
    public final c f8936f;

    /* renamed from: g, reason: collision with root package name */
    public final D f8937g;

    /* renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArraySet f8938h;

    /* renamed from: i, reason: collision with root package name */
    public F f8939i;

    /* renamed from: j, reason: collision with root package name */
    public Pair f8940j;

    /* renamed from: k, reason: collision with root package name */
    public int f8941k;

    /* renamed from: l, reason: collision with root package name */
    public long f8942l;

    /* renamed from: m, reason: collision with root package name */
    public long f8943m;

    /* renamed from: n, reason: collision with root package name */
    public int f8944n;

    public o(I2.a aVar) {
        this.a = (Context) aVar.f4004b;
        n nVar = (n) aVar.f4007e;
        AbstractC0015b.i(nVar);
        this.f8933c = nVar;
        this.f8934d = new SparseArray();
        this.f8935e = (X) aVar.f4008f;
        D d4 = (D) aVar.f4010h;
        this.f8937g = d4;
        this.f8936f = new c((s) aVar.f4005c, d4);
        this.f8938h = new CopyOnWriteArraySet();
        new C2392n().a();
        this.f8942l = -9223372036854775807L;
        this.f8944n = -1;
        this.f8941k = 0;
    }
}
