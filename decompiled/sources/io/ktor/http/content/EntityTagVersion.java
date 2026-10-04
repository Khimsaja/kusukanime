package io.ktor.http.content;

import P3.r;
import b1.AbstractC0703b;
import io.ktor.http.ApplicationResponsePropertiesKt;
import io.ktor.http.HeaderValue;
import io.ktor.http.HeaderValueWithParametersKt;
import io.ktor.http.Headers;
import io.ktor.http.HeadersBuilder;
import io.ktor.http.HttpHeaderValueParserKt;
import io.ktor.http.HttpHeaders;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u000e\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00000\u0010¢\u0006\u0004\b\u000e\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001dR\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'¨\u0006-"}, d2 = {"Lio/ktor/http/content/EntityTagVersion;", "Lio/ktor/http/content/Version;", "", "etag", "", "weak", "<init>", "(Ljava/lang/String;Z)V", "Lio/ktor/http/Headers;", "requestHeaders", "Lio/ktor/http/content/VersionCheckResult;", "check", "(Lio/ktor/http/Headers;)Lio/ktor/http/content/VersionCheckResult;", "other", "match", "(Lio/ktor/http/content/EntityTagVersion;)Z", "", "givenNoneMatchEtags", "noneMatch", "(Ljava/util/List;)Lio/ktor/http/content/VersionCheckResult;", "givenMatchEtags", "Lio/ktor/http/HeadersBuilder;", "builder", "LO3/C;", "appendHeadersTo", "(Lio/ktor/http/HeadersBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lio/ktor/http/content/EntityTagVersion;", "toString", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEtag", "Z", "getWeak", "normalized", "Companion", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class EntityTagVersion implements Version {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final EntityTagVersion STAR = new EntityTagVersion("*", false);
    private final String etag;
    private final String normalized;
    private final boolean weak;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/http/content/EntityTagVersion$Companion;", "", "<init>", "()V", "", "headerValue", "", "Lio/ktor/http/content/EntityTagVersion;", "parse", "(Ljava/lang/String;)Ljava/util/List;", "value", "parseSingle", "(Ljava/lang/String;)Lio/ktor/http/content/EntityTagVersion;", "STAR", "Lio/ktor/http/content/EntityTagVersion;", "getSTAR", "()Lio/ktor/http/content/EntityTagVersion;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final EntityTagVersion getSTAR() {
            return EntityTagVersion.STAR;
        }

        public final List<EntityTagVersion> parse(String headerValue) {
            l.f("headerValue", headerValue);
            List<HeaderValue> headerValue2 = HttpHeaderValueParserKt.parseHeaderValue(headerValue);
            ArrayList arrayList = new ArrayList(r.p(headerValue2, 10));
            for (HeaderValue headerValue3 : headerValue2) {
                if (headerValue3.getQuality() != 1.0d) {
                    throw new IllegalStateException(("entity-tag quality parameter is not allowed: " + headerValue3.getQuality() + '.').toString());
                }
                if (!headerValue3.getParams().isEmpty()) {
                    throw new IllegalStateException(("entity-tag parameters are not allowed: " + headerValue3.getParams() + '.').toString());
                }
                arrayList.add(EntityTagVersion.INSTANCE.parseSingle(headerValue3.getValue()));
            }
            return arrayList;
        }

        public final EntityTagVersion parseSingle(String value) {
            boolean z7;
            l.f("value", value);
            if (value.equals("*")) {
                return getSTAR();
            }
            if (AbstractC2517v.T(value, "W/", false)) {
                value = AbstractC2510o.Y(2, value);
                z7 = true;
            } else {
                z7 = false;
            }
            if (!AbstractC2517v.T(value, "\"", false)) {
                value = HeaderValueWithParametersKt.quote(value);
            }
            return new EntityTagVersion(value, z7);
        }

        private Companion() {
        }
    }

    public EntityTagVersion(String str, boolean z7) {
        l.f("etag", str);
        this.etag = str;
        this.weak = z7;
        this.normalized = (str.equals("*") || AbstractC2517v.T(str, "\"", false)) ? str : HeaderValueWithParametersKt.quote(str);
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            char cCharAt = this.etag.charAt(i7);
            if ((l.g(cCharAt, 32) <= 0 || cCharAt == '\"') && i7 != 0 && i7 != AbstractC2510o.b0(this.etag)) {
                throw new IllegalArgumentException(("Character '" + cCharAt + "' is not allowed in entity-tag.").toString());
            }
        }
    }

    public static /* synthetic */ EntityTagVersion copy$default(EntityTagVersion entityTagVersion, String str, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = entityTagVersion.etag;
        }
        if ((i7 & 2) != 0) {
            z7 = entityTagVersion.weak;
        }
        return entityTagVersion.copy(str, z7);
    }

    @Override // io.ktor.http.content.Version
    public void appendHeadersTo(HeadersBuilder builder) {
        l.f("builder", builder);
        ApplicationResponsePropertiesKt.etag(builder, this.normalized);
    }

    @Override // io.ktor.http.content.Version
    public VersionCheckResult check(Headers requestHeaders) {
        List<EntityTagVersion> list;
        VersionCheckResult versionCheckResultMatch;
        List<EntityTagVersion> list2;
        VersionCheckResult versionCheckResultNoneMatch;
        l.f("requestHeaders", requestHeaders);
        HttpHeaders httpHeaders = HttpHeaders.INSTANCE;
        String str = requestHeaders.get(httpHeaders.getIfNoneMatch());
        if (str != null && (list2 = INSTANCE.parse(str)) != null && (versionCheckResultNoneMatch = noneMatch(list2)) != VersionCheckResult.OK) {
            return versionCheckResultNoneMatch;
        }
        String str2 = requestHeaders.get(httpHeaders.getIfMatch());
        return (str2 == null || (list = INSTANCE.parse(str2)) == null || (versionCheckResultMatch = match(list)) == VersionCheckResult.OK) ? VersionCheckResult.OK : versionCheckResultMatch;
    }

    /* renamed from: component1, reason: from getter */
    public final String getEtag() {
        return this.etag;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getWeak() {
        return this.weak;
    }

    public final EntityTagVersion copy(String etag, boolean weak) {
        l.f("etag", etag);
        return new EntityTagVersion(etag, weak);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntityTagVersion)) {
            return false;
        }
        EntityTagVersion entityTagVersion = (EntityTagVersion) other;
        return l.a(this.etag, entityTagVersion.etag) && this.weak == entityTagVersion.weak;
    }

    public final String getEtag() {
        return this.etag;
    }

    public final boolean getWeak() {
        return this.weak;
    }

    public int hashCode() {
        return Boolean.hashCode(this.weak) + (this.etag.hashCode() * 31);
    }

    public final boolean match(EntityTagVersion other) {
        l.f("other", other);
        EntityTagVersion entityTagVersion = STAR;
        if (equals(entityTagVersion) || other.equals(entityTagVersion)) {
            return true;
        }
        return l.a(this.normalized, other.normalized);
    }

    public final VersionCheckResult noneMatch(List<EntityTagVersion> givenNoneMatchEtags) {
        l.f("givenNoneMatchEtags", givenNoneMatchEtags);
        if (givenNoneMatchEtags.contains(STAR)) {
            return VersionCheckResult.OK;
        }
        if (!givenNoneMatchEtags.isEmpty()) {
            Iterator<T> it = givenNoneMatchEtags.iterator();
            while (it.hasNext()) {
                if (match((EntityTagVersion) it.next())) {
                    return VersionCheckResult.NOT_MODIFIED;
                }
            }
        }
        return VersionCheckResult.OK;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("EntityTagVersion(etag=");
        sb.append(this.etag);
        sb.append(", weak=");
        return AbstractC0703b.n(sb, this.weak, ')');
    }

    public final VersionCheckResult match(List<EntityTagVersion> givenMatchEtags) {
        l.f("givenMatchEtags", givenMatchEtags);
        if (!givenMatchEtags.isEmpty() && !givenMatchEtags.contains(STAR)) {
            Iterator<EntityTagVersion> it = givenMatchEtags.iterator();
            while (it.hasNext()) {
                if (match(it.next())) {
                    return VersionCheckResult.OK;
                }
            }
            return VersionCheckResult.PRECONDITION_FAILED;
        }
        return VersionCheckResult.OK;
    }
}
