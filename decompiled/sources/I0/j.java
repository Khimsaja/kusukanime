package I0;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class j implements CharacterIterator {

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f3895k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3896l;

    /* renamed from: m, reason: collision with root package name */
    public int f3897m = 0;

    public j(CharSequence charSequence, int i7) {
        this.f3895k = charSequence;
        this.f3896l = i7;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i7 = this.f3897m;
        if (i7 == this.f3896l) {
            return (char) 65535;
        }
        return this.f3895k.charAt(i7);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f3897m = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f3896l;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f3897m;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i7 = this.f3896l;
        if (i7 == 0) {
            this.f3897m = i7;
            return (char) 65535;
        }
        int i8 = i7 - 1;
        this.f3897m = i8;
        return this.f3895k.charAt(i8);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i7 = this.f3897m + 1;
        this.f3897m = i7;
        int i8 = this.f3896l;
        if (i7 < i8) {
            return this.f3895k.charAt(i7);
        }
        this.f3897m = i8;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i7 = this.f3897m;
        if (i7 <= 0) {
            return (char) 65535;
        }
        int i8 = i7 - 1;
        this.f3897m = i8;
        return this.f3895k.charAt(i8);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i7) {
        if (i7 > this.f3896l || i7 < 0) {
            throw new IllegalArgumentException("invalid position");
        }
        this.f3897m = i7;
        return current();
    }
}
