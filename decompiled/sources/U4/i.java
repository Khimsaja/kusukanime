package U4;

import B1.G;
import R4.C0570a;
import X4.AbstractC0605b;
import X4.AbstractC0608e;
import X4.AbstractC0613j;
import X4.AbstractC0618o;
import X4.C0607d;
import X4.C0609f;
import X4.C0611h;
import X4.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends AbstractC0618o {

    /* renamed from: q, reason: collision with root package name */
    public static final i f9290q;

    /* renamed from: r, reason: collision with root package name */
    public static final C0570a f9291r = new C0570a(28);

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0608e f9292k;

    /* renamed from: l, reason: collision with root package name */
    public List f9293l;

    /* renamed from: m, reason: collision with root package name */
    public List f9294m;

    /* renamed from: n, reason: collision with root package name */
    public int f9295n;

    /* renamed from: o, reason: collision with root package name */
    public byte f9296o;

    /* renamed from: p, reason: collision with root package name */
    public int f9297p;

    static {
        i iVar = new i();
        f9290q = iVar;
        List list = Collections.EMPTY_LIST;
        iVar.f9293l = list;
        iVar.f9294m = list;
    }

    public i() {
        this.f9295n = -1;
        this.f9296o = (byte) -1;
        this.f9297p = -1;
        this.f9292k = AbstractC0608e.f9883k;
    }

    @Override // X4.w
    public final boolean a() {
        if (this.f9296o == 1) {
            return true;
        }
        this.f9296o = (byte) 1;
        return true;
    }

    @Override // X4.AbstractC0605b
    public final int c() {
        int i7 = this.f9297p;
        if (i7 != -1) {
            return i7;
        }
        int iG = 0;
        for (int i8 = 0; i8 < this.f9293l.size(); i8++) {
            iG += G.g(1, (AbstractC0605b) this.f9293l.get(i8));
        }
        int iF = 0;
        for (int i9 = 0; i9 < this.f9294m.size(); i9++) {
            iF += G.f(((Integer) this.f9294m.get(i9)).intValue());
        }
        int iF2 = iG + iF;
        if (!this.f9294m.isEmpty()) {
            iF2 = iF2 + 1 + G.f(iF);
        }
        this.f9295n = iF;
        int size = this.f9292k.size() + iF2;
        this.f9297p = size;
        return size;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j d() {
        e eVar = new e();
        List list = Collections.EMPTY_LIST;
        eVar.f9262m = list;
        eVar.f9263n = list;
        return eVar;
    }

    @Override // X4.AbstractC0605b
    public final AbstractC0613j e() {
        e eVar = new e();
        List list = Collections.EMPTY_LIST;
        eVar.f9262m = list;
        eVar.f9263n = list;
        eVar.g(this);
        return eVar;
    }

    @Override // X4.AbstractC0605b
    public final void f(G g4) throws IOException {
        c();
        for (int i7 = 0; i7 < this.f9293l.size(); i7++) {
            g4.D(1, (AbstractC0605b) this.f9293l.get(i7));
        }
        if (this.f9294m.size() > 0) {
            g4.K(42);
            g4.K(this.f9295n);
        }
        for (int i8 = 0; i8 < this.f9294m.size(); i8++) {
            g4.C(((Integer) this.f9294m.get(i8)).intValue());
        }
        g4.G(this.f9292k);
    }

    public i(e eVar) {
        this.f9295n = -1;
        this.f9296o = (byte) -1;
        this.f9297p = -1;
        this.f9292k = eVar.f9896k;
    }

    public i(C0609f c0609f, C0611h c0611h) {
        this.f9295n = -1;
        this.f9296o = (byte) -1;
        this.f9297p = -1;
        List list = Collections.EMPTY_LIST;
        this.f9293l = list;
        this.f9294m = list;
        C0607d c0607d = new C0607d();
        G gS = G.s(c0607d, 1);
        boolean z7 = false;
        int i7 = 0;
        while (!z7) {
            try {
                try {
                    int iN = c0609f.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if ((i7 & 1) != 1) {
                                this.f9293l = new ArrayList();
                                i7 |= 1;
                            }
                            this.f9293l.add(c0609f.g(h.f9277x, c0611h));
                        } else if (iN == 40) {
                            if ((i7 & 2) != 2) {
                                this.f9294m = new ArrayList();
                                i7 |= 2;
                            }
                            this.f9294m.add(Integer.valueOf(c0609f.k()));
                        } else if (iN != 42) {
                            if (!c0609f.q(iN, gS)) {
                            }
                        } else {
                            int iD = c0609f.d(c0609f.k());
                            if ((i7 & 2) != 2 && c0609f.b() > 0) {
                                this.f9294m = new ArrayList();
                                i7 |= 2;
                            }
                            while (c0609f.b() > 0) {
                                this.f9294m.add(Integer.valueOf(c0609f.k()));
                            }
                            c0609f.c(iD);
                        }
                    }
                    z7 = true;
                } catch (r e7) {
                    e7.f9907k = this;
                    throw e7;
                } catch (IOException e8) {
                    r rVar = new r(e8.getMessage());
                    rVar.f9907k = this;
                    throw rVar;
                }
            } catch (Throwable th) {
                if ((i7 & 1) == 1) {
                    this.f9293l = Collections.unmodifiableList(this.f9293l);
                }
                if ((i7 & 2) == 2) {
                    this.f9294m = Collections.unmodifiableList(this.f9294m);
                }
                try {
                    gS.m();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    throw th2;
                }
                throw th;
            }
        }
        if ((i7 & 1) == 1) {
            this.f9293l = Collections.unmodifiableList(this.f9293l);
        }
        if ((i7 & 2) == 2) {
            this.f9294m = Collections.unmodifiableList(this.f9294m);
        }
        try {
            gS.m();
        } catch (IOException unused2) {
        } finally {
            this.f9292k = c0607d.g();
        }
    }
}
