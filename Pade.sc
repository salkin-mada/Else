Pade : Pattern{
	*new{|freq=1, phase=0|
		^Plazy({var undulate, result;
			undulate = sin(2pi * freq * Ptime() + phase) % cos(2pi * freq * Ptime() + phase);
			result = sin(4pi / exp(undulate + phase));
			result;
		});
	}
}