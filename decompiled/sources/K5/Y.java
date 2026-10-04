package K5;

import H5.C0270k;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class Y extends L5.b implements G, InterfaceC0329h, L5.q {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4792p = AtomicReferenceFieldUpdater.newUpdater(Y.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: o, reason: collision with root package name */
    public int f4793o;

    public Y(Object obj) {
        this._state$volatile = obj;
    }

    @Override // K5.F
    public final boolean a(Object obj) {
        h(obj);
        return true;
    }

    @Override // L5.q
    public final InterfaceC0329h b(S3.h hVar, int i7, J5.c cVar) {
        return (((i7 < 0 || i7 >= 2) && i7 != -2) || cVar != J5.c.f4300l) ? N.k(this, hVar, i7, cVar) : this;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Path cross not found for [B:58:0x00f8, B:59:0x00f9], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00de, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00de, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0090, B:36:0x0093, B:46:0x00b4, B:49:0x00c4, B:50:0x00de, B:56:0x00f0, B:53:0x00e7, B:55:0x00ed, B:38:0x0099, B:42:0x00a0, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c3 -> B:28:0x007d). Please report as a decompilation issue!!! */
    @Override // K5.InterfaceC0329h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(K5.InterfaceC0330i r17, S3.c r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.Y.collect(K5.i, S3.c):java.lang.Object");
    }

    @Override // L5.b
    public final L5.d d() {
        return new Z();
    }

    @Override // L5.b
    public final L5.d[] e() {
        return new Z[2];
    }

    @Override // K5.InterfaceC0330i
    public final Object emit(Object obj, S3.c cVar) {
        h(obj);
        return O3.C.a;
    }

    @Override // K5.W
    public final Object getValue() {
        F2.G g4 = L5.c.f6161b;
        Object obj = f4792p.get(this);
        if (obj == g4) {
            return null;
        }
        return obj;
    }

    public final void h(Object obj) {
        if (obj == null) {
            obj = L5.c.f6161b;
        }
        i(null, obj);
    }

    public final boolean i(Object obj, Object obj2) {
        int i7;
        L5.d[] dVarArr;
        F2.G g4;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4792p;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.l.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.l.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i8 = this.f4793o;
            if ((i8 & 1) != 0) {
                this.f4793o = i8 + 2;
                return true;
            }
            int i9 = i8 + 1;
            this.f4793o = i9;
            L5.d[] dVarArr2 = this.f6157k;
            while (true) {
                Z[] zArr = (Z[]) dVarArr2;
                if (zArr != null) {
                    for (Z z7 : zArr) {
                        if (z7 != null) {
                            AtomicReference atomicReference = z7.a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (g4 = N.f4772c)) {
                                    F2.G g7 = N.f4771b;
                                    if (obj4 != g7) {
                                        while (!atomicReference.compareAndSet(obj4, g7)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0270k) obj4).resumeWith(O3.C.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, g4)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f4793o;
                    if (i7 == i9) {
                        this.f4793o = i9 + 1;
                        return true;
                    }
                    dVarArr = this.f6157k;
                }
                dVarArr2 = dVarArr;
                i9 = i7;
            }
        }
    }
}
