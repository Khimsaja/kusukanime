package io.ktor.http;

import O3.j;
import P3.z;
import V5.i;
import Z5.AbstractC0632e0;
import Z5.B;
import Z5.H;
import Z5.N;
import Z5.o0;
import Z5.t0;
import b1.AbstractC0703b;
import io.ktor.http.ContentDisposition;
import io.ktor.util.date.GMTDate;
import io.ktor.util.date.GMTDate$$serializer;
import io.ktor.utils.io.JvmSerializable_jvmKt;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import n6.m;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 M2\u00060\u0001j\u0002`\u0002:\u0002NMB}\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011¢\u0006\u0004\b\u0013\u0010\u0014B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0011\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0013\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010%J\u001e\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(J\u008a\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0011HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010\u001aJ\u0010\u0010,\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020.H\u0002¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b?\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bA\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8G¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010D\u001a\u0004\bE\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\bF\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\bG\u0010\u001aR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bI\u0010%R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bJ\u0010%R%\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\bL\u0010(¨\u0006O"}, d2 = {"Lio/ktor/http/Cookie;", "Ljava/io/Serializable;", "Lio/ktor/utils/io/JvmSerializable;", "", ContentDisposition.Parameters.Name, "value", "Lio/ktor/http/CookieEncoding;", "encoding", "", "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", "domain", "path", "", "secure", "httpOnly", "", "extensions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)V", "seen0", "LZ5/o0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;LZ5/o0;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lio/ktor/http/CookieEncoding;", "component4", "()Ljava/lang/Integer;", "component5", "()Lio/ktor/util/date/GMTDate;", "component6", "component7", "component8", "()Z", "component9", "component10", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;)Lio/ktor/http/Cookie;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "writeReplace", "()Ljava/lang/Object;", "self", "LY5/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LO3/C;", "write$Self$ktor_http", "(Lio/ktor/http/Cookie;LY5/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getName", "getValue", "Lio/ktor/http/CookieEncoding;", "getEncoding", "Ljava/lang/Integer;", "getMaxAgeInt", "Lio/ktor/util/date/GMTDate;", "getExpires", "getDomain", "getPath", "Z", "getSecure", "getHttpOnly", "Ljava/util/Map;", "getExtensions", "Companion", "$serializer", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class Cookie implements Serializable {
    private static final O3.i[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String domain;
    private final CookieEncoding encoding;
    private final GMTDate expires;
    private final Map<String, String> extensions;
    private final boolean httpOnly;
    private final Integer maxAge;
    private final String name;
    private final String path;
    private final boolean secure;
    private final String value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/Cookie$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lio/ktor/http/Cookie;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer serializer() {
            return Cookie$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    static {
        j jVar = j.f7525k;
        $childSerializers = new O3.i[]{null, null, z1.c.B(jVar, new c(0)), null, null, null, null, null, null, z1.c.B(jVar, new c(1))};
    }

    public /* synthetic */ Cookie(int i7, String str, String str2, CookieEncoding cookieEncoding, Integer num, GMTDate gMTDate, String str3, String str4, boolean z7, boolean z8, Map map, o0 o0Var) {
        if (3 != (i7 & 3)) {
            AbstractC0632e0.j(i7, 3, Cookie$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.value = str2;
        if ((i7 & 4) == 0) {
            this.encoding = CookieEncoding.URI_ENCODING;
        } else {
            this.encoding = cookieEncoding;
        }
        if ((i7 & 8) == 0) {
            this.maxAge = null;
        } else {
            this.maxAge = num;
        }
        if ((i7 & 16) == 0) {
            this.expires = null;
        } else {
            this.expires = gMTDate;
        }
        if ((i7 & 32) == 0) {
            this.domain = null;
        } else {
            this.domain = str3;
        }
        if ((i7 & 64) == 0) {
            this.path = null;
        } else {
            this.path = str4;
        }
        if ((i7 & 128) == 0) {
            this.secure = false;
        } else {
            this.secure = z7;
        }
        if ((i7 & 256) == 0) {
            this.httpOnly = false;
        } else {
            this.httpOnly = z8;
        }
        if ((i7 & 512) == 0) {
            this.extensions = z.f7780k;
        } else {
            this.extensions = map;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        CookieEncoding[] cookieEncodingArrValues = CookieEncoding.values();
        l.f("values", cookieEncodingArrValues);
        return new B("io.ktor.http.CookieEncoding", cookieEncodingArrValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
        t0 t0Var = t0.a;
        return new H(t0Var, m.K(t0Var), 1);
    }

    public static /* synthetic */ Cookie copy$default(Cookie cookie, String str, String str2, CookieEncoding cookieEncoding, Integer num, GMTDate gMTDate, String str3, String str4, boolean z7, boolean z8, Map map, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = cookie.name;
        }
        if ((i7 & 2) != 0) {
            str2 = cookie.value;
        }
        if ((i7 & 4) != 0) {
            cookieEncoding = cookie.encoding;
        }
        if ((i7 & 8) != 0) {
            num = cookie.maxAge;
        }
        if ((i7 & 16) != 0) {
            gMTDate = cookie.expires;
        }
        if ((i7 & 32) != 0) {
            str3 = cookie.domain;
        }
        if ((i7 & 64) != 0) {
            str4 = cookie.path;
        }
        if ((i7 & 128) != 0) {
            z7 = cookie.secure;
        }
        if ((i7 & 256) != 0) {
            z8 = cookie.httpOnly;
        }
        if ((i7 & 512) != 0) {
            map = cookie.extensions;
        }
        boolean z9 = z8;
        Map map2 = map;
        String str5 = str4;
        boolean z10 = z7;
        GMTDate gMTDate2 = gMTDate;
        String str6 = str3;
        return cookie.copy(str, str2, cookieEncoding, num, gMTDate2, str6, str5, z10, z9, map2);
    }

    public static final /* synthetic */ void write$Self$ktor_http(Cookie self, Y5.b output, SerialDescriptor serialDesc) {
        O3.i[] iVarArr = $childSerializers;
        output.E(serialDesc, 0, self.name);
        output.E(serialDesc, 1, self.value);
        if (output.z(serialDesc) || self.encoding != CookieEncoding.URI_ENCODING) {
            output.j(serialDesc, 2, (KSerializer) iVarArr[2].getValue(), self.encoding);
        }
        if (output.z(serialDesc) || self.maxAge != null) {
            output.F(serialDesc, 3, N.a, self.maxAge);
        }
        if (output.z(serialDesc) || self.expires != null) {
            output.F(serialDesc, 4, GMTDate$$serializer.INSTANCE, self.expires);
        }
        if (output.z(serialDesc) || self.domain != null) {
            output.F(serialDesc, 5, t0.a, self.domain);
        }
        if (output.z(serialDesc) || self.path != null) {
            output.F(serialDesc, 6, t0.a, self.path);
        }
        if (output.z(serialDesc) || self.secure) {
            output.A(serialDesc, 7, self.secure);
        }
        if (output.z(serialDesc) || self.httpOnly) {
            output.A(serialDesc, 8, self.httpOnly);
        }
        if (!output.z(serialDesc) && l.a(self.extensions, z.f7780k)) {
            return;
        }
        output.j(serialDesc, 9, (KSerializer) iVarArr[9].getValue(), self.extensions);
    }

    private final Object writeReplace() {
        return JvmSerializable_jvmKt.JvmSerializerReplacement(CookieJvmSerializer.INSTANCE, this);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<String, String> component10() {
        return this.extensions;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component3, reason: from getter */
    public final CookieEncoding getEncoding() {
        return this.encoding;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getMaxAge() {
        return this.maxAge;
    }

    /* renamed from: component5, reason: from getter */
    public final GMTDate getExpires() {
        return this.expires;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    public final Cookie copy(String name, String value, CookieEncoding encoding, Integer maxAge, GMTDate expires, String domain, String path, boolean secure, boolean httpOnly, Map<String, String> extensions) {
        l.f(ContentDisposition.Parameters.Name, name);
        l.f("value", value);
        l.f("encoding", encoding);
        l.f("extensions", extensions);
        return new Cookie(name, value, encoding, maxAge, expires, domain, path, secure, httpOnly, extensions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) other;
        return l.a(this.name, cookie.name) && l.a(this.value, cookie.value) && this.encoding == cookie.encoding && l.a(this.maxAge, cookie.maxAge) && l.a(this.expires, cookie.expires) && l.a(this.domain, cookie.domain) && l.a(this.path, cookie.path) && this.secure == cookie.secure && this.httpOnly == cookie.httpOnly && l.a(this.extensions, cookie.extensions);
    }

    public final String getDomain() {
        return this.domain;
    }

    public final CookieEncoding getEncoding() {
        return this.encoding;
    }

    public final GMTDate getExpires() {
        return this.expires;
    }

    public final Map<String, String> getExtensions() {
        return this.extensions;
    }

    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    public final Integer getMaxAgeInt() {
        return this.maxAge;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getSecure() {
        return this.secure;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = (this.encoding.hashCode() + A6.b.b(this.value, this.name.hashCode() * 31, 31)) * 31;
        Integer num = this.maxAge;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        GMTDate gMTDate = this.expires;
        int iHashCode3 = (iHashCode2 + (gMTDate == null ? 0 : gMTDate.hashCode())) * 31;
        String str = this.domain;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.path;
        return this.extensions.hashCode() + AbstractC0703b.d(AbstractC0703b.d((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.secure), 31, this.httpOnly);
    }

    public String toString() {
        return "Cookie(name=" + this.name + ", value=" + this.value + ", encoding=" + this.encoding + ", maxAge=" + this.maxAge + ", expires=" + this.expires + ", domain=" + this.domain + ", path=" + this.path + ", secure=" + this.secure + ", httpOnly=" + this.httpOnly + ", extensions=" + this.extensions + ')';
    }

    public Cookie(String str, String str2, CookieEncoding cookieEncoding, Integer num, GMTDate gMTDate, String str3, String str4, boolean z7, boolean z8, Map<String, String> map) {
        l.f(ContentDisposition.Parameters.Name, str);
        l.f("value", str2);
        l.f("encoding", cookieEncoding);
        l.f("extensions", map);
        this.name = str;
        this.value = str2;
        this.encoding = cookieEncoding;
        this.maxAge = num;
        this.expires = gMTDate;
        this.domain = str3;
        this.path = str4;
        this.secure = z7;
        this.httpOnly = z8;
        this.extensions = map;
    }

    public /* synthetic */ Cookie(String str, String str2, CookieEncoding cookieEncoding, Integer num, GMTDate gMTDate, String str3, String str4, boolean z7, boolean z8, Map map, int i7, f fVar) {
        this(str, str2, (i7 & 4) != 0 ? CookieEncoding.URI_ENCODING : cookieEncoding, (i7 & 8) != 0 ? null : num, (i7 & 16) != 0 ? null : gMTDate, (i7 & 32) != 0 ? null : str3, (i7 & 64) != 0 ? null : str4, (i7 & 128) != 0 ? false : z7, (i7 & 256) != 0 ? false : z8, (i7 & 512) != 0 ? z.f7780k : map);
    }
}
