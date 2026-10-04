package io.ktor.http.cio;

import A3.d;
import B3.q;
import O3.i;
import O3.j;
import P3.A;
import P3.r;
import e4.n;
import f4.InterfaceC0881a;
import io.ktor.http.ContentDisposition;
import io.ktor.http.Headers;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;
import y5.k;
import y5.o;
import z1.c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\r0\u00130\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0014\u0010\u001a\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012¨\u0006\u001c"}, d2 = {"Lio/ktor/http/cio/CIOHeaders;", "Lio/ktor/http/Headers;", "Lio/ktor/http/cio/HttpHeadersMap;", "headers", "<init>", "(Lio/ktor/http/cio/HttpHeadersMap;)V", "", "", "names", "()Ljava/util/Set;", ContentDisposition.Parameters.Name, "get", "(Ljava/lang/String;)Ljava/lang/String;", "", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "isEmpty", "()Z", "", "entries", "Lio/ktor/http/cio/HttpHeadersMap;", "names$delegate", "LO3/i;", "getNames", "getCaseInsensitiveName", "caseInsensitiveName", "Entry", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CIOHeaders implements Headers {
    private final HttpHeadersMap headers;

    /* renamed from: names$delegate, reason: from kotlin metadata */
    private final i names;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lio/ktor/http/cio/CIOHeaders$Entry;", "", "", "", "", "offset", "<init>", "(Lio/ktor/http/cio/CIOHeaders;I)V", "I", "getKey", "()Ljava/lang/String;", "key", "getValue", "()Ljava/util/List;", "value", "ktor-http-cio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Entry implements Map.Entry<String, List<? extends String>>, InterfaceC0881a {
        private final int offset;

        public Entry(int i7) {
            this.offset = i7;
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ List<? extends String> setValue(List<? extends String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map.Entry
        public String getKey() {
            return CIOHeaders.this.headers.nameAtOffset(this.offset).toString();
        }

        @Override // java.util.Map.Entry
        public List<? extends String> getValue() {
            return r.H(CIOHeaders.this.headers.valueAtOffset(this.offset).toString());
        }

        /* renamed from: setValue, reason: avoid collision after fix types in other method */
        public List<String> setValue2(List<String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public CIOHeaders(HttpHeadersMap httpHeadersMap) {
        l.f("headers", httpHeadersMap);
        this.headers = httpHeadersMap;
        this.names = c.B(j.f7526l, new q(11, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Entry entries$lambda$4(CIOHeaders cIOHeaders, int i7) {
        return cIOHeaders.new Entry(i7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAll$lambda$2(CharSequence charSequence) {
        l.f("it", charSequence);
        return charSequence.toString();
    }

    private final Set<String> getNames() {
        return (Set) this.names.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkedHashSet names_delegate$lambda$1(CIOHeaders cIOHeaders) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(cIOHeaders.headers.getSize());
        Iterator it = cIOHeaders.headers.offsets().iterator();
        while (it.hasNext()) {
            linkedHashSet.add(cIOHeaders.headers.nameAtOffset(((Number) it.next()).intValue()).toString());
        }
        return linkedHashSet;
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(String str) {
        return Headers.DefaultImpls.contains(this, str);
    }

    @Override // io.ktor.util.StringValues
    public Set<Map.Entry<String, List<String>>> entries() {
        o oVarU = k.U(this.headers.offsets(), new d(19, this));
        Iterator it = oVarU.a.iterator();
        if (!it.hasNext()) {
            return A.f7737k;
        }
        Object next = it.next();
        e4.k kVar = oVarU.f18392b;
        Object objInvoke = kVar.invoke(next);
        if (!it.hasNext()) {
            return AbstractC1420H.K(objInvoke);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(objInvoke);
        while (it.hasNext()) {
            linkedHashSet.add(kVar.invoke(it.next()));
        }
        return linkedHashSet;
    }

    @Override // io.ktor.util.StringValues
    public void forEach(n nVar) {
        Headers.DefaultImpls.forEach(this, nVar);
    }

    @Override // io.ktor.util.StringValues
    public String get(String name) {
        l.f(ContentDisposition.Parameters.Name, name);
        CharSequence charSequence = this.headers.get(name);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public List<String> getAll(String name) {
        l.f(ContentDisposition.Parameters.Name, name);
        List<String> listW = k.W(k.U(this.headers.getAll(name), new io.ktor.client.request.a(22)));
        if (listW.isEmpty()) {
            return null;
        }
        return listW;
    }

    @Override // io.ktor.util.StringValues
    public boolean getCaseInsensitiveName() {
        return true;
    }

    @Override // io.ktor.util.StringValues
    public boolean isEmpty() {
        return this.headers.getSize() == 0;
    }

    @Override // io.ktor.util.StringValues
    public Set<String> names() {
        return getNames();
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(String str, String str2) {
        return Headers.DefaultImpls.contains(this, str, str2);
    }
}
