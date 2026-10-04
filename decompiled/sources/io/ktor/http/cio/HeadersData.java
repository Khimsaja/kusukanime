package io.ktor.http.cio;

import O3.C;
import P3.p;
import S3.c;
import U3.e;
import U3.i;
import com.kusukanime.BuildConfig;
import e4.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import y5.h;
import y5.j;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0003R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/http/cio/HeadersData;", "", "<init>", "()V", "", "arraysCount", "()I", "subArraysCount", "LO3/C;", "prepare", "(I)V", "index", "at", "(I)I", "value", "set", "(II)V", "Ly5/h;", "headersStarts", "()Ly5/h;", BuildConfig.BUILD_TYPE, "", "", "arrays", "Ljava/util/List;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class HeadersData {
    private List<int[]> arrays = new ArrayList();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly5/j;", "", "LO3/C;", "<anonymous>", "(Ly5/j;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.http.cio.HeadersData$headersStarts$1", f = "HttpHeadersMap.kt", l = {264}, m = "invokeSuspend")
    /* renamed from: io.ktor.http.cio.HeadersData$headersStarts$1, reason: invalid class name */
    public static final class AnonymousClass1 extends i implements n {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = HeadersData.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003f -> B:12:0x0049). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x006c -> B:19:0x0070). Please report as a decompilation issue!!! */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                T3.a r0 = T3.a.f9048k
                int r1 = r10.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 != r3) goto L1f
                int r1 = r10.I$1
                int r4 = r10.I$0
                java.lang.Object r5 = r10.L$2
                int[] r5 = (int[]) r5
                java.lang.Object r6 = r10.L$1
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r7 = r10.L$0
                y5.j r7 = (y5.j) r7
                P3.r.Y(r11)
                r11 = r7
                goto L70
            L1f:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L27:
                P3.r.Y(r11)
                java.lang.Object r11 = r10.L$0
                y5.j r11 = (y5.j) r11
                io.ktor.http.cio.HeadersData r1 = io.ktor.http.cio.HeadersData.this
                java.util.List r1 = io.ktor.http.cio.HeadersData.access$getArrays$p(r1)
                java.util.Iterator r1 = r1.iterator()
                r4 = r2
            L39:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L7c
                java.lang.Object r5 = r1.next()
                int[] r5 = (int[]) r5
                r6 = r5
                r5 = r4
                r4 = r1
                r1 = r2
            L49:
                int r7 = r6.length
                if (r1 >= r7) goto L79
                io.ktor.http.cio.HeadersData r7 = io.ktor.http.cio.HeadersData.this
                int r7 = r7.at(r5)
                r8 = -1
                if (r7 == r8) goto L6c
                java.lang.Integer r2 = new java.lang.Integer
                r2.<init>(r5)
                r10.L$0 = r11
                r10.L$1 = r4
                r10.L$2 = r6
                r10.I$0 = r5
                r10.I$1 = r1
                r10.label = r3
                r11.a(r2, r10)
                T3.a r11 = T3.a.f9048k
                return r0
            L6c:
                r9 = r6
                r6 = r4
                r4 = r5
                r5 = r9
            L70:
                int r1 = r1 + 6
                int r4 = r4 + 6
                r9 = r5
                r5 = r4
                r4 = r6
                r6 = r9
                goto L49
            L79:
                r1 = r4
                r4 = r5
                goto L39
            L7c:
                O3.C r11 = O3.C.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.HeadersData.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // e4.n
        public final Object invoke(j jVar, c<? super C> cVar) {
            return ((AnonymousClass1) create(jVar, cVar)).invokeSuspend(C.a);
        }
    }

    public final int arraysCount() {
        return this.arrays.size();
    }

    public final int at(int index) {
        return this.arrays.get(index / 768)[index % 768];
    }

    public final h headersStarts() {
        return new p(new AnonymousClass1(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void prepare(int subArraysCount) {
        for (int i7 = 0; i7 < subArraysCount; i7++) {
            this.arrays.add(HttpHeadersMapKt.IntArrayPool.borrow());
        }
    }

    public final void release() {
        Iterator<int[]> it = this.arrays.iterator();
        while (it.hasNext()) {
            HttpHeadersMapKt.IntArrayPool.recycle(it.next());
        }
        this.arrays.clear();
    }

    public final void set(int index, int value) {
        this.arrays.get(index / 768)[index % 768] = value;
    }
}
