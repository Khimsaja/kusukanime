package io.ktor.http.cio;

import O3.C;
import O3.InterfaceC0554c;
import P3.p;
import S3.c;
import U3.e;
import U3.i;
import com.kusukanime.BuildConfig;
import e4.n;
import io.ktor.http.ContentDisposition;
import io.ktor.http.cio.internals.CharArrayBuilder;
import io.ktor.http.cio.internals.CharsKt;
import java.io.IOException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import v.c0;
import y5.C2419b;
import y5.d;
import y5.h;
import y5.j;
import y5.k;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0015H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\u0006\u0010\u0011\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010&\u001a\u00020\r2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\tH\u0007¢\u0006\u0004\b&\u0010'J-\u0010&\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\u0006\u0010%\u001a\u00020\t¢\u0006\u0004\b&\u0010(J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b+\u0010*J\u0015\u0010,\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b,\u0010*J\u0015\u0010-\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b-\u0010*J\r\u0010.\u001a\u00020\r¢\u0006\u0004\b.\u0010\u000fJ\u000f\u0010/\u001a\u00020\u0015H\u0016¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R$\u00103\u001a\u00020\t2\u0006\u00102\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u00107\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00104R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lio/ktor/http/cio/HttpHeadersMap;", "", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "builder", "<init>", "(Lio/ktor/http/cio/internals/CharArrayBuilder;)V", "", "thresholdReached", "()Z", "", "idx", "idxToOffset", "(I)I", "LO3/C;", "resize", "()V", "", ContentDisposition.Parameters.Name, "headerOffset", "headerHasName", "(Ljava/lang/CharSequence;I)Z", "", "fromIndex", "find", "(Ljava/lang/String;I)I", "get", "(Ljava/lang/String;)Ljava/lang/CharSequence;", "Ly5/h;", "getAll", "(Ljava/lang/String;)Ly5/h;", "offsets", "()Ly5/h;", "nameHash", "valueHash", "nameStartIndex", "nameEndIndex", "valueStartIndex", "valueEndIndex", "put", "(IIIIII)V", "(IIII)V", "nameAt", "(I)Ljava/lang/CharSequence;", "valueAt", "nameAtOffset", "valueAtOffset", BuildConfig.BUILD_TYPE, "toString", "()Ljava/lang/String;", "Lio/ktor/http/cio/internals/CharArrayBuilder;", "value", ContentDisposition.Parameters.Size, "I", "getSize", "()I", "headerCapacity", "Lio/ktor/http/cio/HeadersData;", "headersData", "Lio/ktor/http/cio/HeadersData;", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HttpHeadersMap {
    private final CharArrayBuilder builder;
    private int headerCapacity;
    private HeadersData headersData;
    private int size;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly5/j;", "", "LO3/C;", "<anonymous>", "(Ly5/j;)V"}, k = 3, mv = {2, 1, 0})
    @e(c = "io.ktor.http.cio.HttpHeadersMap$getAll$1", f = "HttpHeadersMap.kt", l = {90}, m = "invokeSuspend")
    /* renamed from: io.ktor.http.cio.HttpHeadersMap$getAll$1, reason: invalid class name */
    public static final class AnonymousClass1 extends i implements n {
        final /* synthetic */ String $name;
        int I$0;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$name = str;
        }

        @Override // U3.a
        public final c<C> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = HttpHeadersMap.this.new AnonymousClass1(this.$name, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[EDGE_INSN: B:23:0x0086->B:21:0x0086 BREAK  A[LOOP:0: B:14:0x0053->B:20:0x007d], SYNTHETIC] */
        @Override // U3.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                r0 = 1
                T3.a r1 = T3.a.f9048k
                int r2 = r8.label
                O3.C r3 = O3.C.a
                r4 = -1
                if (r2 == 0) goto L2e
                if (r2 != r0) goto L26
                int r2 = r8.I$0
                java.lang.Object r5 = r8.L$0
                y5.j r5 = (y5.j) r5
                P3.r.Y(r9)
                io.ktor.http.cio.HttpHeadersMap r9 = io.ktor.http.cio.HttpHeadersMap.this
                io.ktor.http.cio.HeadersData r9 = io.ktor.http.cio.HttpHeadersMap.access$getHeadersData$p(r9)
                int r2 = r2 * 6
                int r2 = r2 + 5
                int r9 = r9.at(r2)
                if (r9 == r4) goto L86
                goto L53
            L26:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L2e:
                P3.r.Y(r9)
                java.lang.Object r9 = r8.L$0
                r5 = r9
                y5.j r5 = (y5.j) r5
                io.ktor.http.cio.HttpHeadersMap r9 = io.ktor.http.cio.HttpHeadersMap.this
                int r9 = r9.getSize()
                if (r9 != 0) goto L3f
                goto L86
            L3f:
                java.lang.String r9 = r8.$name
                r2 = 0
                r6 = 0
                r7 = 3
                int r9 = io.ktor.http.cio.internals.CharsKt.hashCodeLowerCase$default(r9, r6, r6, r7, r2)
                int r9 = java.lang.Math.abs(r9)
                io.ktor.http.cio.HttpHeadersMap r2 = io.ktor.http.cio.HttpHeadersMap.this
                int r2 = io.ktor.http.cio.HttpHeadersMap.access$getHeaderCapacity$p(r2)
                int r9 = r9 % r2
            L53:
                io.ktor.http.cio.HttpHeadersMap r2 = io.ktor.http.cio.HttpHeadersMap.this
                io.ktor.http.cio.HeadersData r2 = io.ktor.http.cio.HttpHeadersMap.access$getHeadersData$p(r2)
                int r6 = r9 * 6
                int r2 = r2.at(r6)
                if (r2 == r4) goto L86
                io.ktor.http.cio.HttpHeadersMap r2 = io.ktor.http.cio.HttpHeadersMap.this
                java.lang.String r7 = r8.$name
                boolean r2 = io.ktor.http.cio.HttpHeadersMap.access$headerHasName(r2, r7, r6)
                if (r2 == 0) goto L7d
                io.ktor.http.cio.HttpHeadersMap r2 = io.ktor.http.cio.HttpHeadersMap.this
                java.lang.CharSequence r2 = r2.valueAtOffset(r6)
                r8.L$0 = r5
                r8.I$0 = r9
                r8.label = r0
                r5.a(r2, r8)
                T3.a r9 = T3.a.f9048k
                return r1
            L7d:
                int r9 = r9 + r0
                io.ktor.http.cio.HttpHeadersMap r2 = io.ktor.http.cio.HttpHeadersMap.this
                int r2 = io.ktor.http.cio.HttpHeadersMap.access$getHeaderCapacity$p(r2)
                int r9 = r9 % r2
                goto L53
            L86:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.http.cio.HttpHeadersMap.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // e4.n
        public final Object invoke(j jVar, c<? super C> cVar) {
            return ((AnonymousClass1) create(jVar, cVar)).invokeSuspend(C.a);
        }
    }

    public HttpHeadersMap(CharArrayBuilder charArrayBuilder) {
        l.f("builder", charArrayBuilder);
        this.builder = charArrayBuilder;
        this.headersData = (HeadersData) HttpHeadersMapKt.HeadersDataPool.borrow();
    }

    public static /* synthetic */ int find$default(HttpHeadersMap httpHeadersMap, String str, int i7, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        return httpHeadersMap.find(str, i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean headerHasName(CharSequence name, int headerOffset) {
        return CharsKt.equalsLowerCase(this.builder, this.headersData.at(headerOffset + 1), this.headersData.at(headerOffset + 2), name);
    }

    private final int idxToOffset(int idx) {
        if (idx < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (idx >= this.size) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        h hVarOffsets = offsets();
        int i7 = idx + 1;
        l.f("<this>", hVarOffsets);
        if (i7 >= 0) {
            return ((Number) k.T(i7 == 0 ? d.a : hVarOffsets instanceof y5.c ? ((y5.c) hVarOffsets).a(i7) : new C2419b(hVarOffsets, i7, 1))).intValue();
        }
        throw new IllegalArgumentException(c0.a(i7, "Requested element count ", " is less than zero.").toString());
    }

    private final void resize() {
        int i7 = this.size;
        HeadersData headersData = this.headersData;
        this.size = 0;
        this.headerCapacity = (this.headerCapacity * 2) | 128;
        HeadersData headersData2 = (HeadersData) HttpHeadersMapKt.HeadersDataPool.borrow();
        headersData2.prepare((headersData.arraysCount() * 2) | 1);
        this.headersData = headersData2;
        Iterator it = headersData.headersStarts().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            put(headersData.at(iIntValue + 1), headersData.at(iIntValue + 2), headersData.at(iIntValue + 3), headersData.at(iIntValue + 4));
        }
        HttpHeadersMapKt.HeadersDataPool.recycle(headersData);
        if (i7 != this.size) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    private final boolean thresholdReached() {
        return ((double) this.size) >= ((double) this.headerCapacity) * 0.75d;
    }

    @InterfaceC0554c
    public final int find(String name, int fromIndex) {
        l.f(ContentDisposition.Parameters.Name, name);
        if (this.size == 0) {
            return -1;
        }
        int iIdxToOffset = idxToOffset(fromIndex);
        while (this.headersData.at(iIdxToOffset) != -1) {
            if (headerHasName(name, iIdxToOffset)) {
                return fromIndex;
            }
            fromIndex++;
            iIdxToOffset = (iIdxToOffset / 6) % this.headerCapacity;
        }
        return -1;
    }

    public final CharSequence get(String name) {
        l.f(ContentDisposition.Parameters.Name, name);
        if (this.size == 0) {
            return null;
        }
        int iAbs = Math.abs(CharsKt.hashCodeLowerCase$default(name, 0, 0, 3, null));
        int i7 = this.headerCapacity;
        while (true) {
            int i8 = iAbs % i7;
            int i9 = i8 * 6;
            if (this.headersData.at(i9) == -1) {
                return null;
            }
            if (headerHasName(name, i9)) {
                return valueAtOffset(i9);
            }
            iAbs = i8 + 1;
            i7 = this.headerCapacity;
        }
    }

    public final h getAll(String name) {
        l.f(ContentDisposition.Parameters.Name, name);
        return new p(new AnonymousClass1(name, null));
    }

    public final int getSize() {
        return this.size;
    }

    @InterfaceC0554c
    public final CharSequence nameAt(int idx) {
        return nameAtOffset(idxToOffset(idx));
    }

    public final CharSequence nameAtOffset(int headerOffset) {
        return this.builder.subSequence(this.headersData.at(headerOffset + 1), this.headersData.at(headerOffset + 2));
    }

    public final h offsets() {
        return this.headersData.headersStarts();
    }

    @InterfaceC0554c
    public final void put(int nameHash, int valueHash, int nameStartIndex, int nameEndIndex, int valueStartIndex, int valueEndIndex) {
        put(nameStartIndex, nameEndIndex, valueStartIndex, valueEndIndex);
    }

    public final void release() {
        this.size = 0;
        this.headerCapacity = 0;
        HttpHeadersMapKt.HeadersDataPool.recycle(this.headersData);
        this.headersData = (HeadersData) HttpHeadersMapKt.HeadersDataPool.borrow();
    }

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        HttpHeadersMapKt.dumpTo(this, "", sb);
        return sb.toString();
    }

    @InterfaceC0554c
    public final CharSequence valueAt(int idx) {
        return valueAtOffset(idxToOffset(idx));
    }

    public final CharSequence valueAtOffset(int headerOffset) {
        return this.builder.subSequence(this.headersData.at(headerOffset + 3), this.headersData.at(headerOffset + 4));
    }

    public final void put(int nameStartIndex, int nameEndIndex, int valueStartIndex, int valueEndIndex) {
        int i7;
        if (thresholdReached()) {
            resize();
        }
        int iAbs = Math.abs(CharsKt.hashCodeLowerCase(this.builder, nameStartIndex, nameEndIndex));
        CharSequence charSequenceSubSequence = this.builder.subSequence(nameStartIndex, nameEndIndex);
        int i8 = iAbs % this.headerCapacity;
        int i9 = -1;
        while (true) {
            i7 = i8 * 6;
            if (this.headersData.at(i7) == -1) {
                break;
            }
            if (headerHasName(charSequenceSubSequence, i7)) {
                i9 = i8;
            }
            i8 = (i8 + 1) % this.headerCapacity;
        }
        this.headersData.set(i7, iAbs);
        this.headersData.set(i7 + 1, nameStartIndex);
        this.headersData.set(i7 + 2, nameEndIndex);
        this.headersData.set(i7 + 3, valueStartIndex);
        this.headersData.set(i7 + 4, valueEndIndex);
        this.headersData.set(i7 + 5, -1);
        if (i9 != -1) {
            this.headersData.set((i9 * 6) + 5, i8);
        }
        this.size++;
    }
}
