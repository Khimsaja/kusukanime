package C1;

import B1.B;
import B1.K;
import O1.g0;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class w {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f629b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f630c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f631d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f632e;

    /* renamed from: f, reason: collision with root package name */
    public Object f633f;

    public w(v vVar) {
        this.f629b = vVar;
        this.f630c = new ArrayDeque();
        this.f631d = new ArrayDeque();
        this.f632e = new PriorityQueue();
        this.a = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r8 < r0.f628l) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r8, B1.B r10) {
        /*
            r7 = this;
            int r0 = r7.a
            if (r0 == 0) goto La1
            java.io.Serializable r1 = r7.f632e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -1
            if (r0 == r2) goto L23
            int r0 = r1.size()
            int r3 = r7.a
            if (r0 < r3) goto L23
            java.lang.Object r0 = r1.peek()
            C1.u r0 = (C1.u) r0
            int r3 = B1.K.a
            long r3 = r0.f628l
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L23
            goto La1
        L23:
            java.lang.Object r0 = r7.f630c
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L33
            B1.B r0 = new B1.B
            r0.<init>()
            goto L39
        L33:
            java.lang.Object r0 = r0.pop()
            B1.B r0 = (B1.B) r0
        L39:
            int r3 = r10.a()
            r0.C(r3)
            byte[] r3 = r10.a
            int r10 = r10.f288b
            byte[] r4 = r0.a
            int r5 = r0.a()
            r6 = 0
            java.lang.System.arraycopy(r3, r10, r4, r6, r5)
            java.lang.Object r10 = r7.f633f
            C1.u r10 = (C1.u) r10
            if (r10 == 0) goto L60
            long r3 = r10.f628l
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L60
            java.util.ArrayList r8 = r10.f627k
            r8.add(r0)
            return
        L60:
            java.lang.Object r10 = r7.f631d
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L70
            C1.u r10 = new C1.u
            r10.<init>()
            goto L76
        L70:
            java.lang.Object r10 = r10.pop()
            C1.u r10 = (C1.u) r10
        L76:
            r10.getClass()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L83
            r6 = 1
        L83:
            B1.AbstractC0015b.c(r6)
            java.util.ArrayList r3 = r10.f627k
            boolean r4 = r3.isEmpty()
            B1.AbstractC0015b.h(r4)
            r10.f628l = r8
            r3.add(r0)
            r1.add(r10)
            r7.f633f = r10
            int r8 = r7.a
            if (r8 == r2) goto La0
            r7.b(r8)
        La0:
            return
        La1:
            java.lang.Object r0 = r7.f629b
            C1.v r0 = (C1.v) r0
            r0.a(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: C1.w.a(long, B1.B):void");
    }

    public void b(int i7) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f632e;
            if (priorityQueue.size() <= i7) {
                return;
            }
            u uVar = (u) priorityQueue.poll();
            int i8 = K.a;
            int i9 = 0;
            while (true) {
                int size = uVar.f627k.size();
                arrayList = uVar.f627k;
                if (i9 >= size) {
                    break;
                }
                ((v) this.f629b).a(uVar.f628l, (B) arrayList.get(i9));
                ((ArrayDeque) this.f630c).push((B) arrayList.get(i9));
                i9++;
            }
            arrayList.clear();
            u uVar2 = (u) this.f633f;
            if (uVar2 != null && uVar2.f628l == uVar.f628l) {
                this.f633f = null;
            }
            ((ArrayDeque) this.f631d).push(uVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(int[] iArr, g0[] g0VarArr, int[] iArr2, int[][][] iArr3, g0 g0Var) {
        this.f629b = iArr;
        this.f630c = g0VarArr;
        this.f632e = iArr3;
        this.f631d = iArr2;
        this.f633f = g0Var;
        this.a = iArr.length;
    }
}
