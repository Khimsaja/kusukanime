package io.ktor.http;

import O3.InterfaceC0554c;
import P3.q;
import P3.r;
import P3.w;
import P3.y;
import V5.i;
import Z5.A;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import io.ktor.utils.io.JvmSerializable_jvmKt;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b:\b\u0007\u0018\u0000 P2\u00060\u0001j\u0002`\u0002:\u0001PBe\b\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b&\u0010\u0016R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b'\u0010\u0016R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b(\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001fR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010,\u0012\u0004\b/\u00100\u001a\u0004\b-\u0010.R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.R!\u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010.R\u0019\u00107\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b;\u0010:R\u001b\u0010>\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u0010\u0016R\u001b\u0010A\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u0010\u0016R\u001b\u0010D\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bB\u00104\u001a\u0004\bC\u0010\u0016R\u001d\u0010G\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u0010\u0016R\u001d\u0010J\u001a\u0004\u0018\u00010\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bI\u0010\u0016R\u001b\u0010M\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bK\u00104\u001a\u0004\bL\u0010\u0016R\u0011\u0010O\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\bN\u0010\u001c¨\u0006Q"}, d2 = {"Lio/ktor/http/Url;", "Ljava/io/Serializable;", "Lio/ktor/utils/io/JvmSerializable;", "Lio/ktor/http/URLProtocol;", "protocol", "", "host", "", "specifiedPort", "", "pathSegments", "Lio/ktor/http/Parameters;", "parameters", "fragment", "user", "password", "", "trailingQuery", "urlString", "<init>", "(Lio/ktor/http/URLProtocol;Ljava/lang/String;ILjava/util/List;Lio/ktor/http/Parameters;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "writeReplace", "()Ljava/lang/Object;", "Ljava/lang/String;", "getHost", "I", "getSpecifiedPort", "Lio/ktor/http/Parameters;", "getParameters", "()Lio/ktor/http/Parameters;", "getFragment", "getUser", "getPassword", "Z", "getTrailingQuery", "()Z", "Ljava/util/List;", "getPathSegments", "()Ljava/util/List;", "getPathSegments$annotations", "()V", "rawSegments", "getRawSegments", "segments$delegate", "LO3/i;", "getSegments", "segments", "protocolOrNull", "Lio/ktor/http/URLProtocol;", "getProtocolOrNull", "()Lio/ktor/http/URLProtocol;", "getProtocol", "encodedPath$delegate", "getEncodedPath", "encodedPath", "encodedQuery$delegate", "getEncodedQuery", "encodedQuery", "encodedPathAndQuery$delegate", "getEncodedPathAndQuery", "encodedPathAndQuery", "encodedUser$delegate", "getEncodedUser", "encodedUser", "encodedPassword$delegate", "getEncodedPassword", "encodedPassword", "encodedFragment$delegate", "getEncodedFragment", "encodedFragment", "getPort", "port", "Companion", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i(with = UrlSerializer.class)
/* loaded from: classes.dex */
public final class Url implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: encodedFragment$delegate, reason: from kotlin metadata */
    private final O3.i encodedFragment;

    /* renamed from: encodedPassword$delegate, reason: from kotlin metadata */
    private final O3.i encodedPassword;

    /* renamed from: encodedPath$delegate, reason: from kotlin metadata */
    private final O3.i encodedPath;

    /* renamed from: encodedPathAndQuery$delegate, reason: from kotlin metadata */
    private final O3.i encodedPathAndQuery;

    /* renamed from: encodedQuery$delegate, reason: from kotlin metadata */
    private final O3.i encodedQuery;

    /* renamed from: encodedUser$delegate, reason: from kotlin metadata */
    private final O3.i encodedUser;
    private final String fragment;
    private final String host;
    private final Parameters parameters;
    private final String password;
    private final List<String> pathSegments;
    private final URLProtocol protocol;
    private final URLProtocol protocolOrNull;
    private final List<String> rawSegments;

    /* renamed from: segments$delegate, reason: from kotlin metadata */
    private final O3.i segments;
    private final int specifiedPort;
    private final boolean trailingQuery;
    private final String urlString;
    private final String user;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/ktor/http/Url$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lio/ktor/http/Url;", "serializer", "()Lkotlinx/serialization/KSerializer;", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return UrlSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public Url(URLProtocol uRLProtocol, String str, int i7, List<String> list, Parameters parameters, String str2, String str3, String str4, boolean z7, String str5) {
        l.f("host", str);
        l.f("pathSegments", list);
        l.f("parameters", parameters);
        l.f("fragment", str2);
        l.f("urlString", str5);
        this.host = str;
        this.specifiedPort = i7;
        this.parameters = parameters;
        this.fragment = str2;
        this.user = str3;
        this.password = str4;
        this.trailingQuery = z7;
        this.urlString = str5;
        if (i7 < 0 || i7 >= 65536) {
            throw new IllegalArgumentException(AbstractC0703b.g(i7, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
        }
        this.pathSegments = list;
        this.rawSegments = list;
        this.segments = z1.c.C(new w(3, list));
        this.protocolOrNull = uRLProtocol;
        this.protocol = uRLProtocol == null ? URLProtocol.INSTANCE.getHTTP() : uRLProtocol;
        this.encodedPath = z1.c.C(new A(3, list, this));
        final int i8 = 0;
        this.encodedQuery = z1.c.C(new InterfaceC0821a(this) { // from class: io.ktor.http.d

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Url f12175l;

            {
                this.f12175l = this;
            }

            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return Url.encodedQuery_delegate$lambda$4(this.f12175l);
                    case 1:
                        return Url.encodedPathAndQuery_delegate$lambda$5(this.f12175l);
                    case 2:
                        return Url.encodedUser_delegate$lambda$6(this.f12175l);
                    case 3:
                        return Url.encodedPassword_delegate$lambda$7(this.f12175l);
                    default:
                        return Url.encodedFragment_delegate$lambda$8(this.f12175l);
                }
            }
        });
        final int i9 = 1;
        this.encodedPathAndQuery = z1.c.C(new InterfaceC0821a(this) { // from class: io.ktor.http.d

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Url f12175l;

            {
                this.f12175l = this;
            }

            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return Url.encodedQuery_delegate$lambda$4(this.f12175l);
                    case 1:
                        return Url.encodedPathAndQuery_delegate$lambda$5(this.f12175l);
                    case 2:
                        return Url.encodedUser_delegate$lambda$6(this.f12175l);
                    case 3:
                        return Url.encodedPassword_delegate$lambda$7(this.f12175l);
                    default:
                        return Url.encodedFragment_delegate$lambda$8(this.f12175l);
                }
            }
        });
        final int i10 = 2;
        this.encodedUser = z1.c.C(new InterfaceC0821a(this) { // from class: io.ktor.http.d

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Url f12175l;

            {
                this.f12175l = this;
            }

            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return Url.encodedQuery_delegate$lambda$4(this.f12175l);
                    case 1:
                        return Url.encodedPathAndQuery_delegate$lambda$5(this.f12175l);
                    case 2:
                        return Url.encodedUser_delegate$lambda$6(this.f12175l);
                    case 3:
                        return Url.encodedPassword_delegate$lambda$7(this.f12175l);
                    default:
                        return Url.encodedFragment_delegate$lambda$8(this.f12175l);
                }
            }
        });
        final int i11 = 3;
        this.encodedPassword = z1.c.C(new InterfaceC0821a(this) { // from class: io.ktor.http.d

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Url f12175l;

            {
                this.f12175l = this;
            }

            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return Url.encodedQuery_delegate$lambda$4(this.f12175l);
                    case 1:
                        return Url.encodedPathAndQuery_delegate$lambda$5(this.f12175l);
                    case 2:
                        return Url.encodedUser_delegate$lambda$6(this.f12175l);
                    case 3:
                        return Url.encodedPassword_delegate$lambda$7(this.f12175l);
                    default:
                        return Url.encodedFragment_delegate$lambda$8(this.f12175l);
                }
            }
        });
        final int i12 = 4;
        this.encodedFragment = z1.c.C(new InterfaceC0821a(this) { // from class: io.ktor.http.d

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Url f12175l;

            {
                this.f12175l = this;
            }

            @Override // e4.InterfaceC0821a
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return Url.encodedQuery_delegate$lambda$4(this.f12175l);
                    case 1:
                        return Url.encodedPathAndQuery_delegate$lambda$5(this.f12175l);
                    case 2:
                        return Url.encodedUser_delegate$lambda$6(this.f12175l);
                    case 3:
                        return Url.encodedPassword_delegate$lambda$7(this.f12175l);
                    default:
                        return Url.encodedFragment_delegate$lambda$8(this.f12175l);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodedFragment_delegate$lambda$8(Url url) {
        int iD0 = AbstractC2510o.d0(url.urlString, '#', 0, 6) + 1;
        if (iD0 == 0) {
            return "";
        }
        String strSubstring = url.urlString.substring(iD0);
        l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodedPassword_delegate$lambda$7(Url url) {
        String str = url.password;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        String strSubstring = url.urlString.substring(AbstractC2510o.d0(url.urlString, ':', url.protocol.getName().length() + 3, 4) + 1, AbstractC2510o.d0(url.urlString, '@', 0, 6));
        l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodedPathAndQuery_delegate$lambda$5(Url url) {
        int iD0 = AbstractC2510o.d0(url.urlString, '/', url.protocol.getName().length() + 3, 4);
        if (iD0 == -1) {
            return "";
        }
        int iD02 = AbstractC2510o.d0(url.urlString, '#', iD0, 4);
        if (iD02 == -1) {
            String strSubstring = url.urlString.substring(iD0);
            l.e("substring(...)", strSubstring);
            return strSubstring;
        }
        String strSubstring2 = url.urlString.substring(iD0, iD02);
        l.e("substring(...)", strSubstring2);
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodedPath_delegate$lambda$3(List list, Url url) {
        int iD0;
        if (list.isEmpty() || (iD0 = AbstractC2510o.d0(url.urlString, '/', url.protocol.getName().length() + 3, 4)) == -1) {
            return "";
        }
        int iF0 = AbstractC2510o.f0(url.urlString, new char[]{'?', '#'}, iD0, false);
        if (iF0 == -1) {
            String strSubstring = url.urlString.substring(iD0);
            l.e("substring(...)", strSubstring);
            return strSubstring;
        }
        String strSubstring2 = url.urlString.substring(iD0, iF0);
        l.e("substring(...)", strSubstring2);
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodedQuery_delegate$lambda$4(Url url) {
        int iD0 = AbstractC2510o.d0(url.urlString, '?', 0, 6) + 1;
        if (iD0 == 0) {
            return "";
        }
        int iD02 = AbstractC2510o.d0(url.urlString, '#', iD0, 4);
        if (iD02 == -1) {
            String strSubstring = url.urlString.substring(iD0);
            l.e("substring(...)", strSubstring);
            return strSubstring;
        }
        String strSubstring2 = url.urlString.substring(iD0, iD02);
        l.e("substring(...)", strSubstring2);
        return strSubstring2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String encodedUser_delegate$lambda$6(Url url) {
        String str = url.user;
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return "";
        }
        int length = url.protocol.getName().length() + 3;
        String strSubstring = url.urlString.substring(length, AbstractC2510o.f0(url.urlString, new char[]{':', '@'}, length, false));
        l.e("substring(...)", strSubstring);
        return strSubstring;
    }

    @InterfaceC0554c
    public static /* synthetic */ void getPathSegments$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List segments_delegate$lambda$1(List list) {
        if (list.isEmpty()) {
            return y.f7779k;
        }
        return list.subList((((CharSequence) q.r0(list)).length() != 0 || list.size() <= 1) ? 0 : 1, ((CharSequence) q.A0(list)).length() == 0 ? r.y(list) : 1 + r.y(list));
    }

    private final Object writeReplace() {
        return JvmSerializable_jvmKt.JvmSerializerReplacement(UrlJvmSerializer.INSTANCE, this);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || Url.class != other.getClass()) {
            return false;
        }
        return l.a(this.urlString, ((Url) other).urlString);
    }

    public final String getEncodedFragment() {
        return (String) this.encodedFragment.getValue();
    }

    public final String getEncodedPassword() {
        return (String) this.encodedPassword.getValue();
    }

    public final String getEncodedPath() {
        return (String) this.encodedPath.getValue();
    }

    public final String getEncodedPathAndQuery() {
        return (String) this.encodedPathAndQuery.getValue();
    }

    public final String getEncodedQuery() {
        return (String) this.encodedQuery.getValue();
    }

    public final String getEncodedUser() {
        return (String) this.encodedUser.getValue();
    }

    public final String getFragment() {
        return this.fragment;
    }

    public final String getHost() {
        return this.host;
    }

    public final Parameters getParameters() {
        return this.parameters;
    }

    public final String getPassword() {
        return this.password;
    }

    public final List<String> getPathSegments() {
        return this.pathSegments;
    }

    public final int getPort() {
        Integer numValueOf = Integer.valueOf(this.specifiedPort);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.protocol.getDefaultPort();
    }

    public final URLProtocol getProtocol() {
        return this.protocol;
    }

    public final URLProtocol getProtocolOrNull() {
        return this.protocolOrNull;
    }

    public final List<String> getRawSegments() {
        return this.rawSegments;
    }

    public final List<String> getSegments() {
        return (List) this.segments.getValue();
    }

    public final int getSpecifiedPort() {
        return this.specifiedPort;
    }

    public final boolean getTrailingQuery() {
        return this.trailingQuery;
    }

    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        return this.urlString.hashCode();
    }

    /* renamed from: toString, reason: from getter */
    public String getUrlString() {
        return this.urlString;
    }
}
