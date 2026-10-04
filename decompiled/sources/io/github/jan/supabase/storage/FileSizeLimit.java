package io.github.jan.supabase.storage;

import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u000e"}, d2 = {"Lio/github/jan/supabase/storage/FileSizeLimit;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "hashCode", "", "toString", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FileSizeLimit {
    private final String value;

    private /* synthetic */ FileSizeLimit(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FileSizeLimit m59boximpl(String str) {
        return new FileSizeLimit(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m60constructorimpl(String str) {
        l.f("value", str);
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m61equalsimpl(String str, Object obj) {
        return (obj instanceof FileSizeLimit) && l.a(str, ((FileSizeLimit) obj).m65unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m62equalsimpl0(String str, String str2) {
        return l.a(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m63hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m64toStringimpl(String str) {
        return A6.b.d(')', "FileSizeLimit(value=", str);
    }

    public boolean equals(Object other) {
        return m61equalsimpl(this.value, other);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m63hashCodeimpl(this.value);
    }

    public String toString() {
        return m64toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m65unboximpl() {
        return this.value;
    }
}
