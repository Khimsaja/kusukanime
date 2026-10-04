package io.ktor.http.auth;

import D6.r;
import I5.d;
import P3.F;
import P3.q;
import P3.y;
import P3.z;
import b1.AbstractC0703b;
import io.ktor.http.CodecsKt;
import io.ktor.http.ContentDisposition;
import io.ktor.http.HeaderValueParam;
import io.ktor.http.HeaderValueWithParametersKt;
import io.ktor.http.parsing.ParseException;
import io.ktor.sse.ServerSentEventKt;
import io.ktor.util.CryptoKt;
import io.ktor.util.Hash;
import io.ktor.utils.io.charsets.CharsetJVMKt;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000e2\u00020\u0001:\u0004\u000f\u0010\u000e\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\n\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader;", "", "", "authScheme", "<init>", "(Ljava/lang/String;)V", "Lio/ktor/http/auth/HeaderValueEncoding;", "encoding", "render", "(Lio/ktor/http/auth/HeaderValueEncoding;)Ljava/lang/String;", "()Ljava/lang/String;", "toString", "Ljava/lang/String;", "getAuthScheme", "Companion", "Single", "Parameterized", "Parameters", "Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "Lio/ktor/http/auth/HttpAuthHeader$Single;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class HttpAuthHeader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String authScheme;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJQ\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Companion;", "", "<init>", "()V", "", Parameters.Realm, "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", Parameters.Charset, "Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "basicAuthChallenge", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "scheme", "Lio/ktor/http/auth/HttpAuthHeader;", "bearerAuthChallenge", "(Ljava/lang/String;Ljava/lang/String;)Lio/ktor/http/auth/HttpAuthHeader;", "nonce", "", "domain", "opaque", "", "stale", "algorithm", "digestAuthChallenge", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ HttpAuthHeader bearerAuthChallenge$default(Companion companion, String str, String str2, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                str2 = null;
            }
            return companion.bearerAuthChallenge(str, str2);
        }

        public static /* synthetic */ Parameterized digestAuthChallenge$default(Companion companion, String str, String str2, List list, String str3, Boolean bool, String str4, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                str2 = CryptoKt.generateNonce();
            }
            String str5 = str2;
            if ((i7 & 4) != 0) {
                list = y.f7779k;
            }
            List list2 = list;
            String str6 = (i7 & 8) != 0 ? null : str3;
            Boolean bool2 = (i7 & 16) != 0 ? null : bool;
            if ((i7 & 32) != 0) {
                str4 = "MD5";
            }
            return companion.digestAuthChallenge(str, str5, list2, str6, bool2, str4);
        }

        public final Parameterized basicAuthChallenge(String realm, Charset charset) {
            l.f(Parameters.Realm, realm);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Parameters.Realm, realm);
            if (charset != null) {
                linkedHashMap.put(Parameters.Charset, CharsetJVMKt.getName(charset));
            }
            return new Parameterized(AuthScheme.Basic, linkedHashMap, (HeaderValueEncoding) null, 4, (f) null);
        }

        public final HttpAuthHeader bearerAuthChallenge(String scheme, String realm) {
            l.f("scheme", scheme);
            return new Parameterized(scheme, realm == null ? z.f7780k : F.J(new O3.l(Parameters.Realm, realm)), (HeaderValueEncoding) null, 4, (f) null);
        }

        public final Parameterized digestAuthChallenge(String realm, String nonce, List<String> domain, String opaque, Boolean stale, String algorithm) {
            l.f(Parameters.Realm, realm);
            l.f("nonce", nonce);
            l.f("domain", domain);
            l.f("algorithm", algorithm);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(Parameters.Realm, HeaderValueWithParametersKt.quote(realm));
            linkedHashMap.put("nonce", HeaderValueWithParametersKt.quote(nonce));
            if (!domain.isEmpty()) {
                linkedHashMap.put("domain", HeaderValueWithParametersKt.quote(q.y0(domain, ServerSentEventKt.SPACE, null, null, null, 62)));
            }
            if (opaque != null) {
                linkedHashMap.put("opaque", HeaderValueWithParametersKt.quote(opaque));
            }
            if (stale != null) {
                linkedHashMap.put("stale", stale.toString());
            }
            linkedHashMap.put("algorithm", algorithm);
            return new Parameterized(AuthScheme.Digest, linkedHashMap, HeaderValueEncoding.QUOTED_WHEN_REQUIRED);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Parameters;", "", "<init>", "()V", "", "Realm", "Ljava/lang/String;", "Charset", "OAuthCallback", "OAuthConsumerKey", "OAuthNonce", "OAuthToken", "OAuthTokenSecret", "OAuthVerifier", "OAuthSignatureMethod", "OAuthTimestamp", "OAuthVersion", "OAuthSignature", "OAuthCallbackConfirmed", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Parameters {
        public static final String Charset = "charset";
        public static final Parameters INSTANCE = new Parameters();
        public static final String OAuthCallback = "oauth_callback";
        public static final String OAuthCallbackConfirmed = "oauth_callback_confirmed";
        public static final String OAuthConsumerKey = "oauth_consumer_key";
        public static final String OAuthNonce = "oauth_nonce";
        public static final String OAuthSignature = "oauth_signature";
        public static final String OAuthSignatureMethod = "oauth_signature_method";
        public static final String OAuthTimestamp = "oauth_timestamp";
        public static final String OAuthToken = "oauth_token";
        public static final String OAuthTokenSecret = "oauth_token_secret";
        public static final String OAuthVerifier = "oauth_verifier";
        public static final String OAuthVersion = "oauth_version";
        public static final String Realm = "realm";

        private Parameters() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Single;", "Lio/ktor/http/auth/HttpAuthHeader;", "", "authScheme", "blob", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "render", "()Ljava/lang/String;", "Lio/ktor/http/auth/HeaderValueEncoding;", "encoding", "(Lio/ktor/http/auth/HeaderValueEncoding;)Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/String;", "getBlob", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Single extends HttpAuthHeader {
        private final String blob;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Single(String str, String str2) {
            super(str, null);
            l.f("authScheme", str);
            l.f("blob", str2);
            this.blob = str2;
            if (!HttpAuthHeaderKt.token68Pattern.b(str2)) {
                throw new ParseException("Invalid blob value: it should be token68", null, 2, null);
            }
        }

        public boolean equals(Object other) {
            if (!(other instanceof Single)) {
                return false;
            }
            Single single = (Single) other;
            return AbstractC2517v.M(single.getAuthScheme(), getAuthScheme(), true) && AbstractC2517v.M(single.blob, this.blob, true);
        }

        public final String getBlob() {
            return this.blob;
        }

        public int hashCode() {
            Hash hash = Hash.INSTANCE;
            String authScheme = getAuthScheme();
            Locale locale = Locale.ROOT;
            String lowerCase = authScheme.toLowerCase(locale);
            l.e("toLowerCase(...)", lowerCase);
            String lowerCase2 = this.blob.toLowerCase(locale);
            l.e("toLowerCase(...)", lowerCase2);
            return hash.combine(lowerCase, lowerCase2);
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public String render() {
            return getAuthScheme() + ' ' + this.blob;
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public String render(HeaderValueEncoding encoding) {
            l.f("encoding", encoding);
            return render();
        }
    }

    public /* synthetic */ HttpAuthHeader(String str, f fVar) {
        this(str);
    }

    public final String getAuthScheme() {
        return this.authScheme;
    }

    public abstract String render();

    public abstract String render(HeaderValueEncoding encoding);

    public String toString() {
        return render();
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\fJ\u001d\u0010\u000f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "Lio/ktor/http/auth/HttpAuthHeader;", "", "authScheme", "", "Lio/ktor/http/HeaderValueParam;", "parameters", "Lio/ktor/http/auth/HeaderValueEncoding;", "encoding", "<init>", "(Ljava/lang/String;Ljava/util/List;Lio/ktor/http/auth/HeaderValueEncoding;)V", "", "(Ljava/lang/String;Ljava/util/Map;Lio/ktor/http/auth/HeaderValueEncoding;)V", ContentDisposition.Parameters.Name, "value", "withParameter", "(Ljava/lang/String;Ljava/lang/String;)Lio/ktor/http/auth/HttpAuthHeader$Parameterized;", "withReplacedParameter", "render", "(Lio/ktor/http/auth/HeaderValueEncoding;)Ljava/lang/String;", "parameter", "(Ljava/lang/String;)Ljava/lang/String;", "encode", "(Ljava/lang/String;Lio/ktor/http/auth/HeaderValueEncoding;)Ljava/lang/String;", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/List;", "getParameters", "()Ljava/util/List;", "Lio/ktor/http/auth/HeaderValueEncoding;", "getEncoding", "()Lio/ktor/http/auth/HeaderValueEncoding;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Parameterized extends HttpAuthHeader {
        private final HeaderValueEncoding encoding;
        private final List<HeaderValueParam> parameters;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HeaderValueEncoding.values().length];
                try {
                    iArr[HeaderValueEncoding.QUOTED_WHEN_REQUIRED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HeaderValueEncoding.QUOTED_ALWAYS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HeaderValueEncoding.URI_ENCODE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Parameterized(String str, List list, HeaderValueEncoding headerValueEncoding, int i7, f fVar) {
            this(str, (List<HeaderValueParam>) list, (i7 & 4) != 0 ? HeaderValueEncoding.QUOTED_WHEN_REQUIRED : headerValueEncoding);
        }

        private final String encode(String str, HeaderValueEncoding headerValueEncoding) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[headerValueEncoding.ordinal()];
            if (i7 == 1) {
                return HeaderValueWithParametersKt.escapeIfNeeded(str);
            }
            if (i7 == 2) {
                return HeaderValueWithParametersKt.quote(str);
            }
            if (i7 == 3) {
                return CodecsKt.encodeURLParameter$default(str, false, 1, null);
            }
            throw new r();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence render$lambda$4(Parameterized parameterized, HeaderValueEncoding headerValueEncoding, HeaderValueParam headerValueParam) {
            l.f("it", headerValueParam);
            return headerValueParam.getName() + '=' + parameterized.encode(headerValueParam.getValue(), headerValueEncoding);
        }

        public boolean equals(Object other) {
            if (!(other instanceof Parameterized)) {
                return false;
            }
            Parameterized parameterized = (Parameterized) other;
            return AbstractC2517v.M(parameterized.getAuthScheme(), getAuthScheme(), true) && l.a(parameterized.parameters, this.parameters);
        }

        public final HeaderValueEncoding getEncoding() {
            return this.encoding;
        }

        public final List<HeaderValueParam> getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            Hash hash = Hash.INSTANCE;
            String lowerCase = getAuthScheme().toLowerCase(Locale.ROOT);
            l.e("toLowerCase(...)", lowerCase);
            return hash.combine(lowerCase, this.parameters);
        }

        public final String parameter(String name) {
            Object next;
            l.f(ContentDisposition.Parameters.Name, name);
            Iterator<T> it = this.parameters.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (l.a(((HeaderValueParam) next).getName(), name)) {
                    break;
                }
            }
            HeaderValueParam headerValueParam = (HeaderValueParam) next;
            if (headerValueParam != null) {
                return headerValueParam.getValue();
            }
            return null;
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public String render(HeaderValueEncoding encoding) {
            l.f("encoding", encoding);
            if (this.parameters.isEmpty()) {
                return getAuthScheme();
            }
            return q.y0(this.parameters, ", ", getAuthScheme() + ' ', null, new d(1, this, encoding), 28);
        }

        public final Parameterized withParameter(String name, String value) {
            l.f(ContentDisposition.Parameters.Name, name);
            l.f("value", value);
            return new Parameterized(getAuthScheme(), q.H0(this.parameters, new HeaderValueParam(name, value)), this.encoding);
        }

        public final Parameterized withReplacedParameter(String name, String value) {
            l.f(ContentDisposition.Parameters.Name, name);
            l.f("value", value);
            Iterator<HeaderValueParam> it = this.parameters.iterator();
            boolean z7 = false;
            int i7 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i7 = -1;
                    break;
                }
                if (l.a(it.next().getName(), name)) {
                    break;
                }
                i7++;
            }
            if (i7 == -1) {
                return withParameter(name, value);
            }
            List<HeaderValueParam> list = this.parameters;
            ArrayList arrayList = new ArrayList();
            for (HeaderValueParam headerValueParam : list) {
                if (l.a(headerValueParam.getName(), name)) {
                    if (z7) {
                        headerValueParam = null;
                    } else {
                        headerValueParam = new HeaderValueParam(name, value);
                        z7 = true;
                    }
                }
                if (headerValueParam != null) {
                    arrayList.add(headerValueParam);
                }
            }
            return new Parameterized(getAuthScheme(), arrayList, this.encoding);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Parameterized(String str, List<HeaderValueParam> list, HeaderValueEncoding headerValueEncoding) {
            super(str, null);
            l.f("authScheme", str);
            l.f("parameters", list);
            l.f("encoding", headerValueEncoding);
            this.parameters = list;
            this.encoding = headerValueEncoding;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!HttpAuthHeaderKt.token68Pattern.b(((HeaderValueParam) it.next()).getName())) {
                    throw new ParseException("Parameter name should be a token", null, 2, null);
                }
            }
        }

        @Override // io.ktor.http.auth.HttpAuthHeader
        public String render() {
            return render(this.encoding);
        }

        public /* synthetic */ Parameterized(String str, Map map, HeaderValueEncoding headerValueEncoding, int i7, f fVar) {
            this(str, (Map<String, String>) map, (i7 & 4) != 0 ? HeaderValueEncoding.QUOTED_WHEN_REQUIRED : headerValueEncoding);
        }

        public Parameterized(String str, Map<String, String> map, HeaderValueEncoding headerValueEncoding) {
            l.f("authScheme", str);
            l.f("parameters", map);
            l.f("encoding", headerValueEncoding);
            Set<Map.Entry<String, String>> setEntrySet = map.entrySet();
            ArrayList arrayList = new ArrayList(P3.r.p(setEntrySet, 10));
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new HeaderValueParam((String) entry.getKey(), (String) entry.getValue()));
            }
            this(str, arrayList, headerValueEncoding);
        }
    }

    private HttpAuthHeader(String str) {
        this.authScheme = str;
        if (!HttpAuthHeaderKt.token68Pattern.b(str)) {
            throw new ParseException(AbstractC0703b.i("Invalid authScheme value: it should be token, but instead it is ", str), null, 2, null);
        }
    }
}
