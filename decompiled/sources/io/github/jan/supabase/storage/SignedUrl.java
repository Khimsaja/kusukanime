package io.github.jan.supabase.storage;

import V5.i;
import Z5.AbstractC0632e0;
import Z5.o0;
import Z5.t0;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, d2 = {"Lio/github/jan/supabase/storage/SignedUrl;", "", "error", "", "signedURL", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getError", "()Ljava/lang/String;", "getSignedURL", "getPath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$storage_kt_release", "$serializer", "Companion", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@i
/* loaded from: classes.dex */
public final /* data */ class SignedUrl {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String error;
    private final String path;
    private final String signedURL;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lio/github/jan/supabase/storage/SignedUrl$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/github/jan/supabase/storage/SignedUrl;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final KSerializer serializer() {
            return SignedUrl$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SignedUrl(int i7, String str, String str2, String str3, o0 o0Var) {
        if (6 != (i7 & 6)) {
            AbstractC0632e0.j(i7, 6, SignedUrl$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i7 & 1) == 0) {
            this.error = null;
        } else {
            this.error = str;
        }
        this.signedURL = str2;
        this.path = str3;
    }

    public static /* synthetic */ SignedUrl copy$default(SignedUrl signedUrl, String str, String str2, String str3, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = signedUrl.error;
        }
        if ((i7 & 2) != 0) {
            str2 = signedUrl.signedURL;
        }
        if ((i7 & 4) != 0) {
            str3 = signedUrl.path;
        }
        return signedUrl.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$storage_kt_release(SignedUrl signedUrl, Y5.b bVar, SerialDescriptor serialDescriptor) {
        if (bVar.z(serialDescriptor) || signedUrl.error != null) {
            bVar.F(serialDescriptor, 0, t0.a, signedUrl.error);
        }
        bVar.E(serialDescriptor, 1, signedUrl.signedURL);
        bVar.E(serialDescriptor, 2, signedUrl.path);
    }

    /* renamed from: component1, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSignedURL() {
        return this.signedURL;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final SignedUrl copy(String error, String signedURL, String path) {
        l.f("signedURL", signedURL);
        l.f("path", path);
        return new SignedUrl(error, signedURL, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignedUrl)) {
            return false;
        }
        SignedUrl signedUrl = (SignedUrl) other;
        return l.a(this.error, signedUrl.error) && l.a(this.signedURL, signedUrl.signedURL) && l.a(this.path, signedUrl.path);
    }

    public final String getError() {
        return this.error;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSignedURL() {
        return this.signedURL;
    }

    public int hashCode() {
        String str = this.error;
        return this.path.hashCode() + A6.b.b(this.signedURL, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SignedUrl(error=");
        sb.append(this.error);
        sb.append(", signedURL=");
        sb.append(this.signedURL);
        sb.append(", path=");
        return A6.b.j(sb, this.path, ')');
    }

    public SignedUrl(String str, String str2, String str3) {
        l.f("signedURL", str2);
        l.f("path", str3);
        this.error = str;
        this.signedURL = str2;
        this.path = str3;
    }

    public /* synthetic */ SignedUrl(String str, String str2, String str3, int i7, kotlin.jvm.internal.f fVar) {
        this((i7 & 1) != 0 ? null : str, str2, str3);
    }
}
