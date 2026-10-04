package io.github.jan.supabase.postgrest.result;

import io.github.jan.supabase.postgrest.Postgrest;
import io.ktor.http.Headers;
import java.util.List;
import k4.j;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import l4.C1447z;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u001a\u0010\u0018\u001a\u0002H\u0019\"\n\b\u0000\u0010\u0019\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001b\u001a\u0004\u0018\u0001H\u0019\"\n\b\u0000\u0010\u0019\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\u001aJ\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001d\"\n\b\u0000\u0010\u0019\u0018\u0001*\u00020\u0001H\u0086\bJ\u001a\u0010\u001e\u001a\u0002H\u0019\"\n\b\u0000\u0010\u0019\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\u001aJ\u001c\u0010\u001f\u001a\u0004\u0018\u0001H\u0019\"\n\b\u0000\u0010\u0019\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0002\u0010\u001aJ\t\u0010 \u001a\u00020\u0003H\u0086\u0002J\t\u0010!\u001a\u00020\u0005H\u0086\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lio/github/jan/supabase/postgrest/result/PostgrestResult;", "", "data", "", "headers", "Lio/ktor/http/Headers;", "postgrest", "Lio/github/jan/supabase/postgrest/Postgrest;", "<init>", "(Ljava/lang/String;Lio/ktor/http/Headers;Lio/github/jan/supabase/postgrest/Postgrest;)V", "getData", "()Ljava/lang/String;", "getHeaders", "()Lio/ktor/http/Headers;", "getPostgrest$annotations", "()V", "getPostgrest", "()Lio/github/jan/supabase/postgrest/Postgrest;", "contentRange", "countOrNull", "", "()Ljava/lang/Long;", "rangeOrNull", "Lkotlin/ranges/LongRange;", "decodeAs", "T", "()Ljava/lang/Object;", "decodeAsOrNull", "decodeList", "", "decodeSingle", "decodeSingleOrNull", "component1", "component2", "postgrest-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PostgrestResult {
    private final String contentRange;
    private final String data;
    private final Headers headers;
    private final Postgrest postgrest;

    public PostgrestResult(String str, Headers headers, Postgrest postgrest) {
        l.f("data", str);
        l.f("headers", headers);
        l.f("postgrest", postgrest);
        this.data = str;
        this.headers = headers;
        this.postgrest = postgrest;
        this.contentRange = headers.get("Content-Range");
    }

    public static /* synthetic */ void getPostgrest$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* renamed from: component2, reason: from getter */
    public final Headers getHeaders() {
        return this.headers;
    }

    public final Long countOrNull() {
        String str = this.contentRange;
        if (str != null) {
            return AbstractC2517v.V(AbstractC2510o.B0(str, "/", str));
        }
        return null;
    }

    public final <T> T decodeAs() {
        getPostgrest().getSerializer();
        getData();
        l.k();
        throw null;
    }

    public final <T> T decodeAsOrNull() {
        try {
            getPostgrest().getSerializer();
            getData();
            l.k();
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final <T> List<T> decodeList() {
        getPostgrest().getSerializer();
        getData();
        C1447z c1447z = C1447z.f12758c;
        l.k();
        throw null;
    }

    public final <T> T decodeSingle() {
        getPostgrest().getSerializer();
        getData();
        C1447z c1447z = C1447z.f12758c;
        l.k();
        throw null;
    }

    public final <T> T decodeSingleOrNull() {
        getPostgrest().getSerializer();
        getData();
        C1447z c1447z = C1447z.f12758c;
        l.k();
        throw null;
    }

    public final String getData() {
        return this.data;
    }

    public final Headers getHeaders() {
        return this.headers;
    }

    public final Postgrest getPostgrest() {
        return this.postgrest;
    }

    public final j rangeOrNull() {
        String str = this.contentRange;
        if (str == null) {
            return null;
        }
        List listU0 = AbstractC2510o.u0(AbstractC2510o.F0(str, "/"), new String[]{"-"}, 0, 6);
        return new j(Long.parseLong((String) listU0.get(0)), Long.parseLong((String) listU0.get(1)));
    }
}
