package i6;

import R1.i;
import e5.AbstractC0832b;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c {
    public final d a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12047b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12048c;

    /* renamed from: d, reason: collision with root package name */
    public a f12049d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f12050e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f12051f;

    public c(d dVar, String str) {
        l.f("taskRunner", dVar);
        l.f(ContentDisposition.Parameters.Name, str);
        this.a = dVar;
        this.f12047b = str;
        this.f12050e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = g6.b.a;
        synchronized (this.a) {
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f12049d;
        if (aVar != null && aVar.f12042b) {
            this.f12051f = true;
        }
        ArrayList arrayList = this.f12050e;
        boolean z7 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f12042b) {
                a aVar2 = (a) arrayList.get(size);
                i iVar = d.f12052h;
                if (d.f12054j.isLoggable(Level.FINE)) {
                    AbstractC0832b.g(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z7 = true;
            }
        }
        return z7;
    }

    public final void c(a aVar, long j7) {
        l.f("task", aVar);
        synchronized (this.a) {
            if (!this.f12048c) {
                if (d(aVar, j7, false)) {
                    this.a.d(this);
                }
            } else if (aVar.f12042b) {
                i iVar = d.f12052h;
                if (d.f12054j.isLoggable(Level.FINE)) {
                    AbstractC0832b.g(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                i iVar2 = d.f12052h;
                if (d.f12054j.isLoggable(Level.FINE)) {
                    AbstractC0832b.g(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(i6.a r12, long r13, boolean r15) {
        /*
            r11 = this;
            r0 = 1
            java.lang.String r1 = "task"
            kotlin.jvm.internal.l.f(r1, r12)
            i6.c r1 = r12.f12043c
            if (r1 != r11) goto Lb
            goto Lf
        Lb:
            if (r1 != 0) goto L91
            r12.f12043c = r11
        Lf:
            i6.d r1 = r11.a
            X4.y r1 = r1.a
            long r1 = java.lang.System.nanoTime()
            long r3 = r1 + r13
            java.util.ArrayList r5 = r11.f12050e
            int r6 = r5.indexOf(r12)
            r7 = 0
            r8 = -1
            if (r6 == r8) goto L3e
            long r9 = r12.f12044d
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L3b
            R1.i r13 = i6.d.f12052h
            java.util.logging.Logger r13 = i6.d.f12054j
            java.util.logging.Level r14 = java.util.logging.Level.FINE
            boolean r13 = r13.isLoggable(r14)
            if (r13 == 0) goto L90
            java.lang.String r13 = "already scheduled"
            e5.AbstractC0832b.g(r12, r11, r13)
            return r7
        L3b:
            r5.remove(r6)
        L3e:
            r12.f12044d = r3
            R1.i r6 = i6.d.f12052h
            java.util.logging.Logger r6 = i6.d.f12054j
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            boolean r6 = r6.isLoggable(r9)
            if (r6 == 0) goto L68
            if (r15 == 0) goto L5a
            long r3 = r3 - r1
            java.lang.String r15 = e5.AbstractC0832b.s(r3)
            java.lang.String r3 = "run again after "
            java.lang.String r15 = r3.concat(r15)
            goto L65
        L5a:
            long r3 = r3 - r1
            java.lang.String r15 = e5.AbstractC0832b.s(r3)
            java.lang.String r3 = "scheduled after "
            java.lang.String r15 = r3.concat(r15)
        L65:
            e5.AbstractC0832b.g(r12, r11, r15)
        L68:
            java.util.Iterator r15 = r5.iterator()
            r3 = r7
        L6d:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r15.next()
            i6.a r4 = (i6.a) r4
            long r9 = r4.f12044d
            long r9 = r9 - r1
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 <= 0) goto L81
            goto L84
        L81:
            int r3 = r3 + r0
            goto L6d
        L83:
            r3 = r8
        L84:
            if (r3 != r8) goto L8a
            int r3 = r5.size()
        L8a:
            r5.add(r3, r12)
            if (r3 != 0) goto L90
            return r0
        L90:
            return r7
        L91:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "task is in multiple queues"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.c.d(i6.a, long, boolean):boolean");
    }

    public final void e() {
        byte[] bArr = g6.b.a;
        synchronized (this.a) {
            this.f12048c = true;
            if (b()) {
                this.a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f12047b;
    }
}
