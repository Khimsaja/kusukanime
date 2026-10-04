package L1;

import B1.AbstractC0015b;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import s2.C1975c;
import s2.C1978f;
import s2.C1979g;
import s2.InterfaceC1976d;
import s2.InterfaceC1977e;
import s2.InterfaceC1982j;

/* loaded from: classes.dex */
public final class b implements InterfaceC1977e, G1.c {
    public final G1.h a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6005b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f6006c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f6007d;

    /* renamed from: e, reason: collision with root package name */
    public final G1.f[] f6008e;

    /* renamed from: f, reason: collision with root package name */
    public final G1.g[] f6009f;

    /* renamed from: g, reason: collision with root package name */
    public int f6010g;

    /* renamed from: h, reason: collision with root package name */
    public int f6011h;

    /* renamed from: i, reason: collision with root package name */
    public G1.f f6012i;

    /* renamed from: j, reason: collision with root package name */
    public G1.d f6013j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6014k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6015l;

    /* renamed from: m, reason: collision with root package name */
    public long f6016m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f6017n;

    /* renamed from: o, reason: collision with root package name */
    public final Object f6018o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC1982j interfaceC1982j) {
        this(new C1979g[2], new C1975c[2]);
        this.f6017n = 1;
        int i7 = this.f6010g;
        G1.f[] fVarArr = this.f6008e;
        AbstractC0015b.h(i7 == fVarArr.length);
        for (G1.f fVar : fVarArr) {
            fVar.h(1024);
        }
        this.f6018o = interfaceC1982j;
    }

    @Override // G1.c
    public final void a() throws InterruptedException {
        synchronized (this.f6005b) {
            this.f6015l = true;
            this.f6005b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // G1.c
    public final void c(long j7) {
        synchronized (this.f6005b) {
            try {
                AbstractC0015b.h(this.f6010g == this.f6008e.length || this.f6014k);
                this.f6016m = j7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G1.c
    public final Object f() {
        G1.f fVar;
        synchronized (this.f6005b) {
            try {
                G1.d dVar = this.f6013j;
                if (dVar != null) {
                    throw dVar;
                }
                AbstractC0015b.h(this.f6012i == null);
                int i7 = this.f6010g;
                if (i7 == 0) {
                    fVar = null;
                } else {
                    G1.f[] fVarArr = this.f6008e;
                    int i8 = i7 - 1;
                    this.f6010g = i8;
                    fVar = fVarArr[i8];
                }
                this.f6012i = fVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    @Override // G1.c
    public final void flush() {
        synchronized (this.f6005b) {
            try {
                this.f6014k = true;
                G1.f fVar = this.f6012i;
                if (fVar != null) {
                    fVar.f();
                    int i7 = this.f6010g;
                    this.f6010g = i7 + 1;
                    this.f6008e[i7] = fVar;
                    this.f6012i = null;
                }
                while (!this.f6006c.isEmpty()) {
                    G1.f fVar2 = (G1.f) this.f6006c.removeFirst();
                    fVar2.f();
                    int i8 = this.f6010g;
                    this.f6010g = i8 + 1;
                    this.f6008e[i8] = fVar2;
                }
                while (!this.f6007d.isEmpty()) {
                    ((G1.g) this.f6007d.removeFirst()).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final G1.d g(Throwable th) {
        switch (this.f6017n) {
            case 0:
                return new d("Unexpected decode error", th);
            default:
                return new C1978f("Unexpected decode error", th);
        }
    }

    public final G1.d h(G1.f fVar, G1.g gVar, boolean z7) {
        switch (this.f6017n) {
            case 0:
                a aVar = (a) gVar;
                try {
                    ByteBuffer byteBuffer = fVar.f2609o;
                    byteBuffer.getClass();
                    AbstractC0015b.h(byteBuffer.hasArray());
                    AbstractC0015b.c(byteBuffer.arrayOffset() == 0);
                    I1.e eVar = (I1.e) this.f6018o;
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    eVar.getClass();
                    aVar.f6003o = I1.e.f(bArrArray, iRemaining);
                    aVar.f2614m = fVar.f2611q;
                    return null;
                } catch (d e7) {
                    return e7;
                }
            default:
                C1979g c1979g = (C1979g) fVar;
                C1975c c1975c = (C1975c) gVar;
                try {
                    ByteBuffer byteBuffer2 = c1979g.f2609o;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    InterfaceC1982j interfaceC1982j = (InterfaceC1982j) this.f6018o;
                    if (z7) {
                        interfaceC1982j.reset();
                    }
                    InterfaceC1976d interfaceC1976dH = interfaceC1982j.h(bArrArray2, 0, iLimit);
                    long j7 = c1979g.f2611q;
                    long j8 = c1979g.f15518t;
                    c1975c.f2614m = j7;
                    c1975c.f15514o = interfaceC1976dH;
                    if (j8 != Long.MAX_VALUE) {
                        j7 = j8;
                    }
                    c1975c.f15515p = j7;
                    c1975c.f2615n = false;
                    return null;
                } catch (C1978f e8) {
                    return e8;
                }
        }
    }

    public final boolean i() {
        boolean z7;
        G1.d dVarG;
        synchronized (this.f6005b) {
            while (!this.f6015l) {
                try {
                    if (!this.f6006c.isEmpty() && this.f6011h > 0) {
                        break;
                    }
                    this.f6005b.wait();
                } finally {
                }
            }
            if (this.f6015l) {
                return false;
            }
            G1.f fVar = (G1.f) this.f6006c.removeFirst();
            G1.g[] gVarArr = this.f6009f;
            int i7 = this.f6011h - 1;
            this.f6011h = i7;
            G1.g gVar = gVarArr[i7];
            boolean z8 = this.f6014k;
            this.f6014k = false;
            if (fVar.c(4)) {
                gVar.a(4);
            } else {
                gVar.f2614m = fVar.f2611q;
                if (fVar.c(134217728)) {
                    gVar.a(134217728);
                }
                long j7 = fVar.f2611q;
                synchronized (this.f6005b) {
                    long j8 = this.f6016m;
                    z7 = j8 == -9223372036854775807L || j7 >= j8;
                }
                if (!z7) {
                    gVar.f2615n = true;
                }
                try {
                    dVarG = h(fVar, gVar, z8);
                } catch (OutOfMemoryError e7) {
                    dVarG = g(e7);
                } catch (RuntimeException e8) {
                    dVarG = g(e8);
                }
                if (dVarG != null) {
                    synchronized (this.f6005b) {
                        this.f6013j = dVarG;
                    }
                    return false;
                }
            }
            synchronized (this.f6005b) {
                try {
                    if (this.f6014k || gVar.f2615n) {
                        gVar.g();
                    } else {
                        this.f6007d.addLast(gVar);
                    }
                    fVar.f();
                    int i8 = this.f6010g;
                    this.f6010g = i8 + 1;
                    this.f6008e[i8] = fVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // G1.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final G1.g e() {
        synchronized (this.f6005b) {
            try {
                G1.d dVar = this.f6013j;
                if (dVar != null) {
                    throw dVar;
                }
                if (this.f6007d.isEmpty()) {
                    return null;
                }
                return (G1.g) this.f6007d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // G1.c
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void b(G1.f fVar) {
        synchronized (this.f6005b) {
            try {
                G1.d dVar = this.f6013j;
                if (dVar != null) {
                    throw dVar;
                }
                AbstractC0015b.c(fVar == this.f6012i);
                this.f6006c.addLast(fVar);
                if (!this.f6006c.isEmpty() && this.f6011h > 0) {
                    this.f6005b.notify();
                }
                this.f6012i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(G1.g gVar) {
        synchronized (this.f6005b) {
            gVar.f();
            int i7 = this.f6011h;
            this.f6011h = i7 + 1;
            this.f6009f[i7] = gVar;
            if (!this.f6006c.isEmpty() && this.f6011h > 0) {
                this.f6005b.notify();
            }
        }
    }

    public b(G1.f[] fVarArr, G1.g[] gVarArr) {
        G1.g aVar;
        G1.f fVar;
        this.f6005b = new Object();
        this.f6016m = -9223372036854775807L;
        this.f6006c = new ArrayDeque();
        this.f6007d = new ArrayDeque();
        this.f6008e = fVarArr;
        this.f6010g = fVarArr.length;
        for (int i7 = 0; i7 < this.f6010g; i7++) {
            G1.f[] fVarArr2 = this.f6008e;
            switch (this.f6017n) {
                case 0:
                    fVar = new G1.f(1);
                    break;
                default:
                    fVar = new C1979g(1);
                    break;
            }
            fVarArr2[i7] = fVar;
        }
        this.f6009f = gVarArr;
        this.f6011h = gVarArr.length;
        for (int i8 = 0; i8 < this.f6011h; i8++) {
            G1.g[] gVarArr2 = this.f6009f;
            switch (this.f6017n) {
                case 0:
                    aVar = new a(this);
                    break;
                default:
                    aVar = new C1975c(this);
                    break;
            }
            gVarArr2[i8] = aVar;
        }
        G1.h hVar = new G1.h(this);
        this.a = hVar;
        hVar.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(I1.e eVar) {
        this(new G1.f[1], new a[1]);
        this.f6017n = 0;
        this.f6018o = eVar;
    }

    @Override // s2.InterfaceC1977e
    public void d(long j7) {
    }
}
