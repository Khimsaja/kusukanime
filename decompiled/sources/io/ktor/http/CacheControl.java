package io.ktor.http;

import P3.q;
import b1.AbstractC0703b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import l4.AbstractC1420H;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lio/ktor/http/CacheControl;", "", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "Lio/ktor/http/CacheControl$Visibility;", "getVisibility", "()Lio/ktor/http/CacheControl$Visibility;", "Visibility", "NoCache", "NoStore", "MaxAge", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CacheControl {
    private final Visibility visibility;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/ktor/http/CacheControl$MaxAge;", "Lio/ktor/http/CacheControl;", "", "maxAgeSeconds", "proxyMaxAgeSeconds", "", "mustRevalidate", "proxyRevalidate", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(ILjava/lang/Integer;ZZLio/ktor/http/CacheControl$Visibility;)V", "", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "getMaxAgeSeconds", "Ljava/lang/Integer;", "getProxyMaxAgeSeconds", "()Ljava/lang/Integer;", "Z", "getMustRevalidate", "()Z", "getProxyRevalidate", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MaxAge extends CacheControl {
        private final int maxAgeSeconds;
        private final boolean mustRevalidate;
        private final Integer proxyMaxAgeSeconds;
        private final boolean proxyRevalidate;

        public /* synthetic */ MaxAge(int i7, Integer num, boolean z7, boolean z8, Visibility visibility, int i8, f fVar) {
            this(i7, (i8 & 2) != 0 ? null : num, (i8 & 4) != 0 ? false : z7, (i8 & 8) != 0 ? false : z8, (i8 & 16) != 0 ? null : visibility);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof MaxAge)) {
                return false;
            }
            MaxAge maxAge = (MaxAge) other;
            return maxAge.maxAgeSeconds == this.maxAgeSeconds && l.a(maxAge.proxyMaxAgeSeconds, this.proxyMaxAgeSeconds) && maxAge.mustRevalidate == this.mustRevalidate && maxAge.proxyRevalidate == this.proxyRevalidate && maxAge.getVisibility() == getVisibility();
        }

        public final int getMaxAgeSeconds() {
            return this.maxAgeSeconds;
        }

        public final boolean getMustRevalidate() {
            return this.mustRevalidate;
        }

        public final Integer getProxyMaxAgeSeconds() {
            return this.proxyMaxAgeSeconds;
        }

        public final boolean getProxyRevalidate() {
            return this.proxyRevalidate;
        }

        public int hashCode() {
            int i7 = this.maxAgeSeconds * 31;
            Integer num = this.proxyMaxAgeSeconds;
            int iD = AbstractC0703b.d(AbstractC0703b.d((i7 + (num != null ? num.intValue() : 0)) * 31, 31, this.mustRevalidate), 31, this.proxyRevalidate);
            Visibility visibility = getVisibility();
            return iD + (visibility != null ? visibility.hashCode() : 0);
        }

        public String toString() {
            ArrayList arrayList = new ArrayList(5);
            arrayList.add("max-age=" + this.maxAgeSeconds);
            if (this.proxyMaxAgeSeconds != null) {
                arrayList.add("s-maxage=" + this.proxyMaxAgeSeconds);
            }
            if (this.mustRevalidate) {
                arrayList.add(io.ktor.client.utils.CacheControl.MUST_REVALIDATE);
            }
            if (this.proxyRevalidate) {
                arrayList.add(io.ktor.client.utils.CacheControl.PROXY_REVALIDATE);
            }
            if (getVisibility() != null) {
                arrayList.add(getVisibility().getHeaderValue());
            }
            return q.y0(arrayList, ", ", null, null, null, 62);
        }

        public MaxAge(int i7, Integer num, boolean z7, boolean z8, Visibility visibility) {
            super(visibility);
            this.maxAgeSeconds = i7;
            this.proxyMaxAgeSeconds = num;
            this.mustRevalidate = z7;
            this.proxyRevalidate = z8;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/http/CacheControl$NoCache;", "Lio/ktor/http/CacheControl;", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoCache extends CacheControl {
        public NoCache(Visibility visibility) {
            super(visibility);
        }

        public boolean equals(Object other) {
            return (other instanceof NoCache) && getVisibility() == ((NoCache) other).getVisibility();
        }

        public int hashCode() {
            Visibility visibility = getVisibility();
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }

        public String toString() {
            if (getVisibility() == null) {
                return io.ktor.client.utils.CacheControl.NO_CACHE;
            }
            return "no-cache, " + getVisibility().getHeaderValue();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/ktor/http/CacheControl$NoStore;", "Lio/ktor/http/CacheControl;", "Lio/ktor/http/CacheControl$Visibility;", "visibility", "<init>", "(Lio/ktor/http/CacheControl$Visibility;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoStore extends CacheControl {
        public NoStore(Visibility visibility) {
            super(visibility);
        }

        public boolean equals(Object other) {
            return (other instanceof NoStore) && ((NoStore) other).getVisibility() == getVisibility();
        }

        public int hashCode() {
            Visibility visibility = getVisibility();
            if (visibility != null) {
                return visibility.hashCode();
            }
            return 0;
        }

        public String toString() {
            if (getVisibility() == null) {
                return io.ktor.client.utils.CacheControl.NO_STORE;
            }
            return "no-store, " + getVisibility().getHeaderValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lio/ktor/http/CacheControl$Visibility;", "", "", "headerValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getHeaderValue$ktor_http", "()Ljava/lang/String;", "Public", "Private", "ktor-http"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Visibility {
        private static final /* synthetic */ V3.a $ENTRIES;
        private static final /* synthetic */ Visibility[] $VALUES;
        private final String headerValue;
        public static final Visibility Public = new Visibility("Public", 0, io.ktor.client.utils.CacheControl.PUBLIC);
        public static final Visibility Private = new Visibility("Private", 1, io.ktor.client.utils.CacheControl.PRIVATE);

        private static final /* synthetic */ Visibility[] $values() {
            return new Visibility[]{Public, Private};
        }

        static {
            Visibility[] visibilityArr$values = $values();
            $VALUES = visibilityArr$values;
            $ENTRIES = AbstractC1420H.z(visibilityArr$values);
        }

        private Visibility(String str, int i7, String str2) {
            this.headerValue = str2;
        }

        public static V3.a getEntries() {
            return $ENTRIES;
        }

        public static Visibility valueOf(String str) {
            return (Visibility) Enum.valueOf(Visibility.class, str);
        }

        public static Visibility[] values() {
            return (Visibility[]) $VALUES.clone();
        }

        /* renamed from: getHeaderValue$ktor_http, reason: from getter */
        public final String getHeaderValue() {
            return this.headerValue;
        }
    }

    public CacheControl(Visibility visibility) {
        this.visibility = visibility;
    }

    public final Visibility getVisibility() {
        return this.visibility;
    }
}
