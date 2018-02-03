package Coding.MapReduce.InvertedIndex;

import java.io.IOException;

import org.apache.commons.lang.StringUtils;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.FileSplit;

public class Map extends Mapper<LongWritable, Text, Text, Text> {

	private Text documentId;
	private Text word = new Text();

	@Override
	protected void setup(Context context) {
		String filename =
				((FileSplit) context.getInputSplit()).getPath().getName();
		documentId = new Text(filename);
	}

	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {
		for (String token : StringUtils.split(value.toString())) {
			word.set(token);
			context.write(word, documentId);
		}
	}
}