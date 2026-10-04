package io.github.jan.supabase.storage.resumable;

import A6.b;
import io.ktor.http.ContentDisposition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0002¨\u0006\u0019"}, d2 = {"Lio/github/jan/supabase/storage/resumable/Fingerprint;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "parts", "", "getParts-impl", "(Ljava/lang/String;)Ljava/util/List;", "source", "getSource-impl", ContentDisposition.Parameters.Size, "", "getSize-impl", "(Ljava/lang/String;)J", "equals", "", "other", "hashCode", "", "toString", "Companion", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Fingerprint {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int FINGERPRINT_PARTS = 2;
    public static final String FINGERPRINT_SEPARATOR = "::";
    private final String value;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lio/github/jan/supabase/storage/resumable/Fingerprint$Companion;", "", "<init>", "()V", "FINGERPRINT_PARTS", "", "FINGERPRINT_SEPARATOR", "", "invoke", "Lio/github/jan/supabase/storage/resumable/Fingerprint;", "source", ContentDisposition.Parameters.Size, "", "invoke-dc9EZ54", "(Ljava/lang/String;J)Ljava/lang/String;", "value", "invoke-3xapfgk", "(Ljava/lang/String;)Ljava/lang/String;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        /* renamed from: invoke-3xapfgk, reason: not valid java name */
        public final String m95invoke3xapfgk(String value) {
            l.f("value", value);
            String strM86constructorimpl = Fingerprint.m86constructorimpl(value);
            if (Fingerprint.m89getPartsimpl(strM86constructorimpl).size() != 2) {
                return null;
            }
            return strM86constructorimpl;
        }

        /* renamed from: invoke-dc9EZ54, reason: not valid java name */
        public final String m96invokedc9EZ54(String source, long size) {
            l.f("source", source);
            return Fingerprint.m86constructorimpl(source + Fingerprint.FINGERPRINT_SEPARATOR + size);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Fingerprint(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Fingerprint m85boximpl(String str) {
        return new Fingerprint(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m86constructorimpl(String str) {
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m87equalsimpl(String str, Object obj) {
        return (obj instanceof Fingerprint) && l.a(str, ((Fingerprint) obj).m94unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m88equalsimpl0(String str, String str2) {
        return l.a(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getParts-impl, reason: not valid java name */
    public static final List<String> m89getPartsimpl(String str) {
        return AbstractC2510o.u0(str, new String[]{FINGERPRINT_SEPARATOR}, 0, 6);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final long m90getSizeimpl(String str) {
        return Long.parseLong(m89getPartsimpl(str).get(1));
    }

    /* renamed from: getSource-impl, reason: not valid java name */
    public static final String m91getSourceimpl(String str) {
        return m89getPartsimpl(str).get(0);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m92hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m93toStringimpl(String str) {
        return b.d(')', "Fingerprint(value=", str);
    }

    public boolean equals(Object other) {
        return m87equalsimpl(this.value, other);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m92hashCodeimpl(this.value);
    }

    public String toString() {
        return m93toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m94unboximpl() {
        return this.value;
    }
}
