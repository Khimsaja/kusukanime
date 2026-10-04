package J0;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class d extends z1.c {

    /* renamed from: r, reason: collision with root package name */
    public final BreakIterator f4078r;

    public d(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.f4078r = characterInstance;
    }

    @Override // z1.c
    public final int D(int i7) {
        return this.f4078r.following(i7);
    }

    @Override // z1.c
    public final int E(int i7) {
        return this.f4078r.preceding(i7);
    }
}
